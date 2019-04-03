package com.niit.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WelcomeLogging {

	@Before("execution(* com.niit.service.*.*(..))")
	public void logBefore()
	{
		System.out.println("*******************WELCOME TO ICICI BANK************************");
	}
	
	
	@After("execution(* com.niit.service.*.*(..))") 
	public void logAfter() 
	{
		System.out.println("**************Thank You Visit Again************");
	}
}
