package com.cts.springcore.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String studentName; // cant apply inner bean
	private Address address; // inner bean - autowiring - byType ( Type & class name)
							 // byName - propertyname is reference & bean id (propertyname & bean id)
//	private int studentid;
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
