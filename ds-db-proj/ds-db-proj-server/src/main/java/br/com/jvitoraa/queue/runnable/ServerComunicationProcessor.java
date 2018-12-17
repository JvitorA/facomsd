package br.com.jvitoraa.queue.runnable;

import java.util.Objects;

import br.com.jvitoraa.grpc.dto.CommandDto;
import br.com.jvitoraa.grpc.facade.ClientFacade;
import br.com.jvitoraa.grpc.service.NewConnectionService;
import br.com.jvitoraa.grpc.vo.RangeVO;
import br.com.jvitoraa.observer.GrpcObserver;
import br.com.jvitoraa.queue.controller.QueueController;

public class ServerComunicationProcessor implements Runnable {

	public ServerComunicationProcessor(Integer leftServerPort, Integer rightServerPort, RangeVO range,
			QueueController queueController, NewConnectionService newConnectionService) {
		this.leftServerPort = leftServerPort;
		this.rightServerPort = rightServerPort;
		this.range = range;
		this.queueController = queueController;
		this.newConnectionService = newConnectionService;
	}

	private Integer leftServerPort;
	private Integer rightServerPort;
	private QueueController queueController;
	private ClientFacade leftClientFacade;
	private ClientFacade rightClientFacade;
	private NewConnectionService newConnectionService;

	private RangeVO range;

	@Override
	public void run() {
		leftClientFacade = new ClientFacade(leftServerPort);
		rightClientFacade = new ClientFacade(rightServerPort);
		while (true) {
			this.process();
		}
	}

	public void process() {

		CommandDto command = this.queueController.getFthQueue().poll();

		if (Objects.nonNull(command)) {
			GrpcObserver observer = new GrpcObserver();
			observer.setPreviousObserver(command.getObserver());
			String leftOrRight = this.range.moveLeftOrRight(command.getId().intValue());

			if (leftOrRight.equals("LEFT")) {
				switch (command.getTypeOfCommand()) {
				case "CREATE":
					leftClientFacade.create(command.getId(), command.getValue(), observer);
					break;
				case "READ":
					leftClientFacade.read(command.getId(), observer);
					break;
				case "UPDATE":
					leftClientFacade.update(command.getId(), command.getValue(), observer);
					break;
				case "DELETE":
					leftClientFacade.delete(command.getId(), observer);
					break;
				}
			} else if (leftOrRight.equals("RIGHT")) {
				switch (command.getTypeOfCommand()) {
				case "CREATE":
					rightClientFacade.create(command.getId(), command.getValue(), observer);
					break;
				case "READ":
					rightClientFacade.read(command.getId(), observer);
					break;
				case "UPDATE":
					rightClientFacade.update(command.getId(), command.getValue(), observer);
					break;
				case "DELETE":
					rightClientFacade.delete(command.getId(), observer);
					break;
				}
			}

		}

	}
}
