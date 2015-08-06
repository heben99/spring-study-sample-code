package com.imooc.aop.advice.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;



public class MoocAspect {

	public void before() {
		System.out.println("MoocAspect invoked before().");
	}
	
	public void after() {
		System.out.println("MoocAspect invoked after().");
	}
	
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("before around");
		Object o = joinPoint.proceed();
		System.out.println("after around");
		
		return o;
	}
	
public Object aroundInit(ProceedingJoinPoint joinPoint, String s, int a) throws Throwable{
		
		System.out.println("before aroundInit:" + s + "," + a);
		Object o = joinPoint.proceed();
		System.out.println("after aroundInit:"  + s + "," + a);
		
		return o;
	}
	
}
