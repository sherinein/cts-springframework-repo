package com.cts.springjdbc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cts.springjdbc.model.Employee;



public class RowMapperImpl implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int n) throws SQLException {
		Employee emp=new Employee();
		System.out.println("mapRow called");
		emp.setEmpid(rs.getInt("empid"));
		emp.setEmpname(rs.getString("empname"));
		emp.setAge(rs.getInt("age"));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}

}
