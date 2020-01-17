package com.ocajexam.chapter.eight;

import com.ocajexam.chapter.eight.model.Logger;
import com.ocajexam.chapter.eight.model.NetworkConnection;
import com.ocajexam.chapter.eight.model.SystemStatus;

public class ProgramacaoParaInterface {

	public static void main(String[] args) throws InterruptedException {
		new ProgramacaoParaInterface();
	}

	public ProgramacaoParaInterface() throws InterruptedException {
		Logger logger = new Logger();
		SystemStatus systemStatus = new SystemStatus();
		NetworkConnection networkConnection = new NetworkConnection();
		logger.appendToLog(systemStatus);
		logger.appendToLog(networkConnection);
		networkConnection.connect();
		Thread.sleep(2000);
		logger.appendToLog(systemStatus);
		logger.appendToLog(networkConnection);
		logger.close();
	}
}
