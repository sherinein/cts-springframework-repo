package com.cts.springjdbc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.cts.springjdbc.model.Employee;



public class ResultSetExtractorImpl1 implements ResultSetExtractor<Object> {
	@Override
	public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
		System.out.println("extractData method Called");
		List<Employee> listOfEmployee =new ArrayList<Employee>();
		while(rs.next()) {
		Employee employee=new Employee();
		employee.setEmpid(rs.getInt(1));
		employee.setEmpname(rs.getString(2));
		employee.setAge(rs.getInt(3));
		employee.setSalary(rs.getDouble(4));
		listOfEmployee.add(employee);
		}
		return listOfEmployee;
	} 
	

}
