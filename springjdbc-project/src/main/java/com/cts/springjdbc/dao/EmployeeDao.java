package com.cts.springjdbc.dao;

import java.util.List;

import com.cts.springjdbc.model.Employee;

public interface EmployeeDao {
	Employee getEmployeeByName(String ename);
	List<Employee> getAllEmployee();
}
