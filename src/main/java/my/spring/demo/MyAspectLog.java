package my.spring.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectLog {

	@Pointcut("execution(* my.spring.demo.*Service.*(..))")
	public void cut() {} 
	
	@Before("cut() && args(s)")
	public void before(String s) {
		System.out.println("log before service:" + s);
	}
	
	@After("cut() && args(s)")
	public void after(String s) {
		System.out.println("log after service:" + s);
	}
}
