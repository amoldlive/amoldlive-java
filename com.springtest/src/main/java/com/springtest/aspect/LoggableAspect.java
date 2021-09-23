package com.springtest.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggableAspect {

	private final Logger LOGGER=LoggerFactory.getLogger(LoggableAspect.class);
	
	@Pointcut("execution(public void doProgress())")
	public void doProgress() {}
	
	@Before("doProgress()")
	public void executeLogging(JoinPoint joinPoint) {
		String MethodName=joinPoint.getSignature().getName();
		LOGGER.info("@Before Advice - starting method : "+MethodName);
	}
	
	
	@After("doProgress()")
	public void executeLoggingAfter(JoinPoint joinPoint) {
		String targetName=joinPoint.getTarget().toString();
		LOGGER.info("@After Advice - completing method : "+targetName);
	}
	
	
	/*
	 * @AfterReturning
	 * 
	 * @AfterThrowing
	 * 
	 * @Around
	 */
	
}
