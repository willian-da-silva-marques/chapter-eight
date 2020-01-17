package com.ocajexam.chapter.eight.model;

public class SystemStatus implements Logable {

	private long createdTimestamp;

	public SystemStatus() {
		this.createdTimestamp = System.currentTimeMillis();
	}

	private int getStatus() {
		if (System.currentTimeMillis() - this.createdTimestamp > 1000)
			return 1;
		else
			return -1;
	}

	@Override
	public String getInitInfo() {
		return "SystemStatus object created " + createdTimestamp;
	}

	@Override
	public String getLogableEvent() {
		return String.valueOf("Status: " + this.getStatus());
	}

}
