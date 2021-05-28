package com.cts.springjdbc.service;

import java.util.List;

import com.cts.springjdbc.model.Employee;

public interface EmployeeService {
	Employee getEmployeeByName(String ename);
	List<Employee> getAllEmployee();
	void saveEmployee(Employee emp);

	
}
