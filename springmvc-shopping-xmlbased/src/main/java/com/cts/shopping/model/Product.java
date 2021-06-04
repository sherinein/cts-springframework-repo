package com.cts.shopping.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int pid;
	private String productName;
	private int quantity;
	private double price;
		
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int pid, String productName, int quantity, double price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	
	

}
