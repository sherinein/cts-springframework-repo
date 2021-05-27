package org.cts.aop;



import java.util.logging.Logger;

import org.cts.aop.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	// Create Logger Object
	public static Logger logger=Logger.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {    
    	
    	// Read Java configuration file
    	// load objects in to the container
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop.xml");
    	// 2. get the objects from the container
    	
    	ProductService productService=(ProductService)applicationContext.getBean("productService");
		
		
		  logger.info("\n Main Program ");
		  logger.info("--------------------------------");
		  logger.info("Calling addProduct Method ");
		  logger.info("--------------------------------"); int
		  result=productService.addProduct(10, 20);
		  logger.info("--------------------------------");
		  System.out.println("Result is  "+result);
		 
				
		  logger.info("--------------------------------");
		  logger.info("Calling delayProduct Method ");
		  System.out.println(productService.delayProduct());
		  logger.info("--------------------------------");
		 
			
		  logger.info("--------------------------------");
		  logger.info("Calling getProduct Method ");
		  logger.info("--------------------------------"); 
		  productService.getProduct();
		  logger.info("--------------------------------");
		 
		 
    }
}
