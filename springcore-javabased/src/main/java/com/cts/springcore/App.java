package com.cts.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.springcore.config.SpringConfig;
import com.cts.springcore.dto.Car;
import com.cts.springcore.service.CarService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
      // Scanner s=new Scanner(System.in);
       
       Car car =context.getBean("car1",Car.class);
       System.out.println(car.hashCode());
       System.out.println(car.getColor());
       System.out.println(car.getModel());
       CarService service=context.getBean(CarService.class);
       System.out.println(service.hashCode());
       context.registerShutdownHook();
    }
}
