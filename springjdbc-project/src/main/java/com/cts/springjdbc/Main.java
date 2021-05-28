package com.cts.springjdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.springjdbc.config.SpringJdbcConfig;
import com.cts.springjdbc.model.Employee;
import com.cts.springjdbc.service.EmployeeService;
import com.cts.springjdbc.service.EmployeeServiceImpl;


public class Main {
	
	
	public static void main(String[] args) {

		// perform the crud operation 
		Scanner s=new Scanner(System.in);
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
		Employee emp=context.getBean(Employee.class);
		EmployeeService service=context.getBean(EmployeeServiceImpl.class);
		System.out.println("1. Insert Employee \n 2. Display All Employee \n 3.GetEmployeeByname \n 6.Quit");
		while(true) {
			System.out.println("Enter the choice to perform CRUD operation");
			int choice=Integer.parseInt(s.nextLine());
			switch(choice) {
			case 1:
				System.out.println("Insert Employee");
				System.out.println("Enter the Employee name");
				emp.setEmpname(s.nextLine());
				System.out.println("Enter the salary");
				emp.setSalary(Integer.parseInt(s.nextLine()));
				service.saveEmployee(emp);
				break;
			case 2:
				System.out.println("Retrieve all the Employee from the table");
				List<Employee> list=service.getAllEmployee();
				Iterator<Employee> iterator=list.iterator();
				while(iterator.hasNext()) {
					Employee emp1=iterator.next();
					System.out.println("Employee id is "+emp1.getEmpid());
					System.out.println("Employee Name is "+emp1.getEmpname());
					System.out.println("Employee Age is "+emp1.getAge());
					System.out.println("Employee Salary : "+emp1.getSalary());
				  System.out.println("------------------------------------------");
				}
				break;
			case 3:
				System.out.println(" Retrieve by employee name");
				System.out.println("Enter the employee name");
				emp.setEmpname(s.nextLine());
				Employee emp1=service.getEmployeeByName(emp.getEmpname());
				System.out.println(emp1.getEmpname()+ " "+emp1.getSalary());
				
			default:
			}
		}
		

	}

		
		
		
}


