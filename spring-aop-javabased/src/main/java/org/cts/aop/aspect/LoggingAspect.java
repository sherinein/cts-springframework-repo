package org.cts.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution(* register*())")
	public void foremployee() {
		
	}
	
	@Before("foremployee()")
	public void beforeRegister() {
		System.out.println("beforeRegister");
	}
	@After("foremployee()")
	public void afterRegister() {
		System.out.println("after register");
	}
	
	
	
	
	

}
