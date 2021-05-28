package com.cts.springjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.springjdbc.dao.RowMapperImpl;
import com.cts.springjdbc.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

		
		  String sql="select * from employee where empname='Priya'";
		  /*   --------------retrieve single record----------------*/
		  Employee   employee=jdbcTemplate.queryForObject(sql, new RowMapperImpl());
		  System.out.println(employee.getEmpname());
		 

		/* -------------- retrieve multiple records--------------- */

		/*
		 * String sqlQuery = "select * from employee";
		 * 
		 * List<Employee> employees = jdbcTemplate.query(sqlQuery, new RowMapperImpl());
		 * for (Employee emp : employees) { System.out.println(emp.getEmpname()); }
		 */

	}

}
