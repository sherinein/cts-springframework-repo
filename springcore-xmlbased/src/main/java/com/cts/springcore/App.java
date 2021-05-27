package com.cts.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.springcore.dto.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("springcontext.xml");// context -container object
      // Scanner s=new Scanner(System.in);
       
       Car car =context.getBean(Car.class);
       System.out.println(car.getModel());
       System.out.println(car.getColor());
      
    }
}
