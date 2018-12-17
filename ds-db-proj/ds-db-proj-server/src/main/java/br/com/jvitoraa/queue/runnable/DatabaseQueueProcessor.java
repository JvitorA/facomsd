package br.com.jvitoraa.queue.runnable;

import java.math.BigInteger;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

import com.ufu.jvitoraa.interaction.Response;

import br.com.jvitoraa.atomix.AtomixController;
import br.com.jvitoraa.grpc.dto.CommandDto;
import br.com.jvitoraa.queue.controller.QueueController;
import br.com.jvitoraa.repository.DatabaseRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DatabaseQueueProcessor implements Runnable {

	private static final Logger LOGGER = Logger.getLogger(DatabaseQueueProcessor.class.getName());
	
	private QueueController queueController;
	private DatabaseRepository database;
	private AtomixController atomixController;
	
	@Override
	public void run() {
		while (true) {
			this.process();
		}
	}
	
	private void process() {
		CommandDto command = this.queueController.getTrdQueue().poll();
		Response response;
		
		if (Objects.nonNull(command)) {
			switch (command.getTypeOfCommand()) {
			case "CREATE":
				LOGGER.info("Creating register with Id: " + command.getId());
				if (database.create(BigInteger.valueOf(command.getId()), command.getValue())) {
					response = Response.newBuilder().setResponseText("Register created!").build();
					this.atomixInsertCall(BigInteger.valueOf(command.getId()), command.getValue());
				} else {
					response = Response.newBuilder().setResponseText("Cannot create, Id alredy exists!").build();
				}

				this.setObserver(command, response);
				break;
			case "READ":
				LOGGER.info("Reading register with Id: " + command.getId());

				String readValue = database.read(BigInteger.valueOf(command.getId()));

				if (StringUtils.isNotBlank(readValue)) {
					response = Response.newBuilder().setResponseText("Valor lido: " + readValue).build();
				} else {
					response = Response.newBuilder().setResponseText("Register not found!").build();
				}

				this.setObserver(command, response);
				break;
			case "UPDATE":
				LOGGER.info("Updating register with Id: " + command.getId());

				if (database.update(BigInteger.valueOf(command.getId()), command.getValue())) {
					response = Response.newBuilder().setResponseText("Register updated sucessfully!").build();
					this.atomixInsertCall(BigInteger.valueOf(command.getId()), command.getValue());
				} else {
					response = Response.newBuilder().setResponseText("Cannot update, Register not found!").build();
				}

				this.setObserver(command, response);
				break;
			case "DELETE":
				LOGGER.info("Deleting register with Id: " + command.getId());

				if (database.delete(BigInteger.valueOf(command.getId()))) {
					this.atomixDeleteCall(BigInteger.valueOf(command.getId()));
					response = Response.newBuilder().setResponseText("Register deleted!").build();
				} else {
					response = Response.newBuilder().setResponseText("Cannot delete, Regiser not found!").build();
				}

				this.setObserver(command, response);
				break;
			}
		}
		
	}

	private void setObserver(CommandDto command, Response response) {
		command.getObserver().onNext(response);
		command.getObserver().onCompleted();
	}
	
	private void atomixInsertCall(BigInteger key, String value) {
		atomixController
			.getAtomixReplica()
			.getMap("commands")
			.thenCompose(m -> m.put(key, value));
	}
	
	private void atomixDeleteCall(BigInteger key) {
		atomixController
			.getAtomixReplica()
			.getMap("commands")
			.thenCompose(m -> m.remove(key));
	}
	
	private String atomixReadCall(BigInteger key) {
		
		try {
			return atomixController.getAtomixReplica().getMap("commands").thenCompose(m -> m.get(key))
					.thenApply(a -> (String) a).get();

		} catch (InterruptedException | ExecutionException e) {
			LOGGER.info(e.getMessage());
		}
		
		return null;
	}
	
}
