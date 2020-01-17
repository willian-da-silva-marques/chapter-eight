package com.ocajexam.chapter.eight.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.sun.org.slf4j.internal.LoggerFactory;

public class Logger {

	private static final com.sun.org.slf4j.internal.Logger LOGGER = LoggerFactory.getLogger(Logger.class);

	private BufferedWriter out;

	public Logger() {
		try {
			this.out = new BufferedWriter(new FileWriter("logfile.txt"));
		} catch (IOException e) {
			LOGGER.error("Error (Logger){}", e.getMessage());
		}
	}

	public void appendToLog(Logable logable) {
		try {
			out.write("Object history: " + logable.getInitInfo());
			out.newLine();
			out.write("Object log event: " + logable.getLogableEvent());
			out.newLine();
		} catch (IOException e) {
			LOGGER.error("Error (appendToLog){}", e.getMessage());
		}
	}

	public void close() {
		try {
			out.flush();
			out.close();
		} catch (IOException e) {
			LOGGER.error("Error (close){}", e.getMessage());
		}
	}
}
