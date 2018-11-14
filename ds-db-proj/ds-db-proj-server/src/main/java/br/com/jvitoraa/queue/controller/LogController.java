package br.com.jvitoraa.queue.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LogController {
	
	private FileWriter writer;
	private String filePath;

	public LogController(String fileName) throws IOException {
		this.filePath = "./db/recover/log/";
        File file = new File("./db/recover/log/" + fileName + ".txt");
        file.getParentFile().mkdirs();
        writer = new FileWriter(file, true);
	}
}
