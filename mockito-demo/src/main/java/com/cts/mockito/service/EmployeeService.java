package com.cts.mockito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.mockito.dao.EmployeeDao;
import com.cts.mockito.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public List<Employee> getEmployeeList(){
		// perform business logic 
		return dao.getEmployeeList();
	}
	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}
	public void addEmployee(Employee emp) {
		dao.addEmployee(emp);
	}
}
