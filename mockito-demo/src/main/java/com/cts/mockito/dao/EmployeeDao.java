package com.cts.mockito.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cts.mockito.dto.Employee;

@Repository
public class EmployeeDao {
	private Map<Integer,Employee> db=new HashMap<>();
	
	public List<Employee> getEmployeeList() {
		List<Employee> list=new ArrayList<>();
		if(list.isEmpty()) {
		list.addAll(db.values());
		}
		return list;
	}

	public Employee getEmployeeById(int id) {
		return db.get(id);
	}

	public void addEmployee(Employee emp) {
		emp.setEmployeeid(db.keySet().size()+1);
		db.put(emp.getEmployeeid(), emp);
		
	}
}
