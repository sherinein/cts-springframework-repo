package com.cts.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cts.springcore.dto.Car;

@Configuration
@ComponentScan(basePackages = "com.cts.springcore")
public class SpringConfig {

	@Bean("car1")
	public Car getCar1() {
		Car car=new Car();
		car.setColor("white");
		car.setModel("etios");
		return car;
	}
	@Bean("car2")
	public Car getCar2() {
		Car car=new Car();
		car.setColor("black");
		car.setModel("maruthi");
		return car;
	}
	
}
