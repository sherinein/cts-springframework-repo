package org.cts.aop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

public class ProductService {
	
	public int addProduct(int a,int b) {
		return a+b;
	}
	public int addProduct1(int a,int b) {
		return a+b;
	}
	
	public void getProduct() {
		throw new ArithmeticException();
	}
	
	public String delayProduct() {
		// simulate a delay
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		return "Product delay due to Corona";
	}

}
