package com.cts.mockito.service;

import static org.junit.Assert.*;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.cts.mockito.dao.EmployeeDao;
import com.cts.mockito.dto.Employee;
@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {
	@InjectMocks // used to create a inject mock object
	EmployeeService service;
	@Mock
	EmployeeDao dao;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this); // current mock object is initialized
	}
	@Test
	public void testGetEmployeeList() {
		
		List<Employee> list=new ArrayList<Employee>();
		Employee emp1=new Employee(1,"Nirmala","Sherine","sherinein@gmail.com");
		Employee emp2=new Employee(2,"Renisha","Lynette","lynet@gmail.com");
		Employee emp3=new Employee(3,"Renita","Colette","colet@gmail.com");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		when(dao.getEmployeeList()).thenReturn(list);
		//   using mock object to call method        specify return object
	}
	
	@Test
	public void testGetEmployeeById() {
		when(dao.getEmployeeById(1)).thenReturn(new Employee(1,"Nirmala","Sherine","sherinein@gmail.com"));
		Employee emp=service.getEmployeeById(1);
		assertEquals("Nirmala",emp.getFirstName());
		assertEquals("Sherine",emp.getLastName());
		assertEquals("sherinein@gmail.com",emp.getEmail());
	}

	@Test
	public void testAddEmployee() {
		Employee emp=new Employee(4,"Antony","Prakash","tony@gmail.com");
		service.addEmployee(emp);
		verify(dao,times(1)).addEmployee(emp);
		
	}

}
