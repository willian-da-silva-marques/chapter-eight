package com.ocajexam.chapter.eight.coercoes.model;

public class ClassB extends ClassA {

	@Override
	public String whoAmI() {
		return "ClassB";
	}

	public String specialClassBMethod() {
		return "ClassB only method";
	}
}
