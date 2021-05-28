package com.cts.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;


public class RowCallBackHandlerDemo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		jdbcTemplate.query("select empname from employee",new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				do {
					System.out.println("processrow method called");
					System.out.println(rs.getString("empname"));
				}while(rs.next());
				
			}
		});
		
	}

}
