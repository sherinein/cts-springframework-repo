package com.cts.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.springjdbc.model.Employee;


public class BeanPropertyRowMapperDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate",JdbcTemplate.class);
		/*-------------- Retrieve single record from table --------------*/
		String sql="select * from employee where empname='Priya'";
		Employee emp=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Employee>(Employee.class));
		System.out.println(emp.getEmpname());
		System.out.println(emp.getAge());
		/*-------------- Retrieve single record from table --------------*/
		
		
	}

}
