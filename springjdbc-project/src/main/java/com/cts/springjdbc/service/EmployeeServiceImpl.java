package com.cts.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springjdbc.dao.EmployeeDao;
import com.cts.springjdbc.dao.EmployeeDaoImpl;
import com.cts.springjdbc.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
	private EmployeeDao dao;
			
	public EmployeeServiceImpl() {
		super();
		System.out.println("service object created");
	}

	@Override
	public Employee getEmployeeByName(String ename) {
		
		return dao.getEmployeeByName(ename);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	@Override
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	
}
