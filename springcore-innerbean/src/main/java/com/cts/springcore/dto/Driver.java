package com.cts.springcore.dto;

public class Driver {
	private String driverName;

	public Driver() {
		super();
		System.out.println("driver object is created");
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		System.out.println("dirver setter based injection");
		this.driverName = driverName;
	}
	
}
