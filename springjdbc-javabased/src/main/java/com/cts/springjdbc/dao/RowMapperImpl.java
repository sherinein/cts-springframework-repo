package com.cts.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cts.springjdbc.model.Employee;



public class RowMapperImpl implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int n) throws SQLException {
		Employee emp=new Employee();
		System.out.println("mapRow called");
		emp.setEmpname(rs.getString("empname"));
		
		return emp;
	}

}
