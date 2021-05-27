package com.cts.springcore;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.springcore.dto.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("springcontext.xml");// context -container object
      Student student=context.getBean(Student.class);
      System.out.println(student.getStudentName());
      System.out.println(student.getAddress().getCity());
       
      
       
       
       
       
       
    }
}
