package com.cts.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertEmpDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate",JdbcTemplate.class);
		// insert or update or delete 
		String sql="insert query";
		int n=jdbcTemplate.update(sql);
		
	}

}
