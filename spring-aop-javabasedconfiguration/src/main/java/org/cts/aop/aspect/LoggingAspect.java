package org.cts.aop.aspect;

import java.util.logging.Logger;

//import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.cts.aop.App;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	// Create Logger Object
	public static Logger logger = Logger.getLogger(LoggingAspect.class.getName());

	// @Before Advice
	@Before("execution(* org.cts.aop.service.*.add*(..))")
	public void beforeAdvice(JoinPoint jointPoint) {
		String methodname = jointPoint.getSignature().toShortString();
		logger.info("\n =====> Executing @Before on method: " + methodname);

	}

	// @After Advice (finally)
	@After("execution(* org.cts.aop.service.*.getProduct())")
	public void afterAdvice(JoinPoint jointPoint) {
		String methodname = jointPoint.getSignature().toShortString();
		logger.info("\n =====> Executing @After on method: " + methodname);

	}

	// @AfterReturning Advice
	@AfterReturning("execution(* org.cts.aop.service.*.add*(..))")
	public void afterReturningAdvice(JoinPoint jointPoint) {
		String methodname = jointPoint.getSignature().toShortString();
		logger.info("\n =====> Executing @AfterReturning on method: " + methodname);

	}

	// @AfterThrowing Advice
	@AfterThrowing(pointcut="execution(* org.cts.aop.service.*.getProduct())",throwing="ex")
	public void afterThrowingAdvice(JoinPoint jointPoint,Throwable ex) {
		
		String methodname = jointPoint.getSignature().toShortString();
		
		logger.info("\n =====> Executing @AfterThrowing on method: " + methodname);
		
		
		logger.info("\n =====> The exception is : " +ex);

	}
	
	@Around("execution(* org.cts.aop.service.*.delay*())")
	public Object logAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
	
		String methodName=proceedingJoinPoint.getSignature().toShortString();
		logger.info("\n =====> Executing @Around on method: " + methodName);
		
		// get begin timestamp
		
		long begin=System.currentTimeMillis();
		// now ,lets execute the method
		Object result=proceedingJoinPoint.proceed();
		
		// get end timestamp
		long end=System.currentTimeMillis();
		
		// compute the duration 
		long duration=end-begin;
		
		logger.info("/n ===========> Duration : "+ duration/1000.0 +"seconds");
		return result;
		
	}
	
	
	
	
	
	
	
}
