package com.cts.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.springjdbc.dao.ResultSetExtractorImpl;
import com.cts.springjdbc.dao.ResultSetExtractorImpl1;
import com.cts.springjdbc.model.Employee;



public class ResultSetExtractorDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		/*--------------retrieve single record----------------*/
		
		String sql = "select * from employee where empname='Priya'";
		Employee employee = jdbcTemplate.query(sql, new ResultSetExtractorImpl());
		System.out.println(employee.getEmpname());

		/* -------------- retrieve multiple records--------------- */
		String sqlQuery = "select * from employee";
		List<Employee> listOfEmp=(List<Employee>)jdbcTemplate.query(sqlQuery, new ResultSetExtractorImpl1());
		for(Employee emp:listOfEmp) {
			System.out.println(emp.getEmpname());
		}
	}

}
