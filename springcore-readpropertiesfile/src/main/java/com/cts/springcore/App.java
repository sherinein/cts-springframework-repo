package com.cts.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.springcore.dto.User;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("springcontext.xml");// context -container object
      // Scanner s=new Scanner(System.in);
       
     User user=context.getBean(User.class);
     System.out.println("UserName is  " +user.getUsername());
     System.out.println("Password is  " +user.getPassword());
    }
}
