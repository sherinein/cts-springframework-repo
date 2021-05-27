package com.cts.springcore.dto;

public class Course {
	private String courseName;
	private String fees;
	
	public Course() {
		super();
		System.out.println("course object is created");
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	
	

}
