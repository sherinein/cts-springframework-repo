package org.cts.aop.config;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// This is Java Configuration file
@Configuration
@ComponentScan(basePackages= {"org.cts.aop"})
@EnableAspectJAutoProxy
public class SpringConfig {
	// No need to write object description here
	// @ComponentScan find the @Component annotation in the base package and it create object
	// and loaded in the spring configuration file

}
