package com.gallelloit.mappertest;

public class CarDto {

	private String theModel;

	public CarDto(String laMarca) {
		this.theModel = laMarca;
	}

	public String getLaMarca() {
		return theModel;
	}

	public void setLaMarca(String laMarca) {
		this.theModel = laMarca;
	}
	
}
