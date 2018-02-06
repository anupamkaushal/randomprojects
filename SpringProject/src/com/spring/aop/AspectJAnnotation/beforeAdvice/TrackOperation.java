package com.spring.aop.AspectJAnnotation.beforeAdvice;


import org.aspectj.lang.JoinPoint;  
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before;  
import org.aspectj.lang.annotation.Pointcut;  
  

//create the aspect class that contains before advice.
@Aspect
public class TrackOperation {
	
	@Pointcut("execution(* Operation.*(..))")
    public void k123(){} //pointcut name
	
	@Before("k123()")//applying pointcut on before advice  
	public void myadvice1(JoinPoint jp)
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: "  + jp.getSignature());  
		
		
	}
	
	

}
