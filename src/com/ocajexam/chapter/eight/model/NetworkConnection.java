package com.ocajexam.chapter.eight.model;

public class NetworkConnection implements Logable {
	
	private long createdTimestamp;
	private String currentLogMessage;
	
	public NetworkConnection() {
		this.createdTimestamp = System.currentTimeMillis();
		this.currentLogMessage = "Inicialized";
	}
	
	public void connect() {
		this.currentLogMessage = "Connected at " + System.currentTimeMillis();
	}

	@Override
	public String getInitInfo() {
		return "NetworkConnection object created " + createdTimestamp;
	}

	@Override
	public String getLogableEvent() {
		return currentLogMessage;
	}
}