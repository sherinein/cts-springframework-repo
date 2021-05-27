package com.cts.springcore.dto;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private String model;
	private String color;
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
	

}
