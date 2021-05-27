package com.cts.springcore.dto;

public class Car {
	private String model;
	private String color;
	private Driver driver;
	
	public Car() {
		super();
	 System.out.println("car object is created");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	

}
