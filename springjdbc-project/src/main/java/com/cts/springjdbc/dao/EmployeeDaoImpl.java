package com.cts.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.springjdbc.dao.impl.ResultSetExtractorImpl1;
import com.cts.springjdbc.dao.impl.RowMapperImpl;
import com.cts.springjdbc.model.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDaoImpl() {
		super();
		System.out.println("dao object and jdbc object created");
	}

	@Override
	public Employee getEmployeeByName(String ename) {
		String sql="select * from employee where empname= ?";
		return jdbcTemplate.queryForObject(sql,new Object[] {ename}, new RowMapperImpl());
	}

	@Override
	public List<Employee> getAllEmployee() {
		String sqlQuery="select * from employee";
		List<Employee> listOfEmployees=(List<Employee>)jdbcTemplate.query(sqlQuery,new ResultSetExtractorImpl1());
		return listOfEmployees;
	}

}
