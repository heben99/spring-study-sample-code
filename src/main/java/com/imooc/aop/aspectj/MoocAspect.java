package com.imooc.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MoocAspect {

	@Pointcut("execution(* com.imooc.aop.aspectj.biz.*.*(..))")
	public void cut() {}
	
	@Before("cut()")
	public void before() {
		System.out.println("AspectJ before");
	}
	
	@Before("cut() && args(s)")
	public void beforeArgs(String s) {
		System.out.println("AspectJ before:" + s);
	}
	
	@After("cut()")
	public void after() {
		System.out.println("AspectJ after");
	}
	
	@AfterReturning(pointcut="cut()",returning="ret") 
	public void afterReturning(Object ret) {
		System.out.println("AspectJ afterReturning:" + ret);
	}
	
	@AfterThrowing(pointcut="cut()",throwing="e")
	public void afterThrowing(Exception e) {
		System.out.println("afterTrhowing:" + e.getMessage());
	}
	
	@Around("cut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around start");
		Object o = pjp.proceed();
		System.out.println("around end");
		return o;
	}
}
