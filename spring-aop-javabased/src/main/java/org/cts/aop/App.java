package org.cts.aop;

import org.cts.aop.config.SpringConfig;
import org.cts.aop.model.Employee;
import org.cts.aop.service.CustomerService;
import org.cts.aop.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    
    	// Read Java configuration file
    	// load objects in to the container
    	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
    	// 2. get the objects from the container
    	EmployeeService employeeService=(EmployeeService)applicationContext.getBean("employeeService");
    	CustomerService customerService=(CustomerService)applicationContext.getBean("customerService");
    	
    	employeeService.registerEmployee();
    	customerService.registerCustomer();
    	
    	
    	
    	
    	
    	
    }
}
