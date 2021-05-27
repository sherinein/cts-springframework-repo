package org.cts.aop.service;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
	
	public void registerCustomer() {
		System.out.println("CustomerService registerEmployee method");
	}
}
