package com.cts.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.cts.springjdbc.model.Employee;



public class ResultSetExtractorImpl implements ResultSetExtractor<Employee> {

	@Override
	public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
		Employee emp=new Employee();
		System.out.println("extractData called");
		rs.next();
		emp.setEmpname(rs.getString("empname"));
		return emp;
	}

}
