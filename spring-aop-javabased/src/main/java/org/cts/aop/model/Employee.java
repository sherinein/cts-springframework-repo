package org.cts.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String ename;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
