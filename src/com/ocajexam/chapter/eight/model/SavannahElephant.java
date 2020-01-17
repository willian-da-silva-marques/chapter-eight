package com.ocajexam.chapter.eight.model;

public class SavannahElephant implements Describable {

	private String description;
	private String scientificName;
	private int lifeExpectancy;
	private int gestationPeriod;
	private String trophicLevel;
	
	public SavannahElephant(String scientificName, int lifeExpectancy, int gestationPeriod, String trophicLevel) {
		this.scientificName = scientificName;
		this.lifeExpectancy = lifeExpectancy;
		this.gestationPeriod = gestationPeriod;
		this.trophicLevel = trophicLevel;
		this.description = "The scientific name of the Savanna Elephant is " + this.scientificName 
				+ ",\nyour life expectancy its between " + this.lifeExpectancy + " and " + (this.lifeExpectancy+10) +" years"
				+ ", your gestation period is of " + this.gestationPeriod
				+ " months, and your trophic level is " + this.trophicLevel.concat(".");
	}

	@Override
	public String getDescription() {
		return this.description;
	}
}
