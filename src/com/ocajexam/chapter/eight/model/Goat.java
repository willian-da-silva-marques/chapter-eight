package com.ocajexam.chapter.eight.model;

public class Goat implements Describable {

	private String description;

	public Goat(String name) {
		this.description = "A goat named " + name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}
}
