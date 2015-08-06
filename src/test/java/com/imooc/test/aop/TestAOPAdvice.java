package com.imooc.test.aop;

import org.junit.Test;
import org.junit.runners.JUnit4;

import com.imooc.aop.advice.aspect.parent.Fit;
import com.imooc.aop.advice.biz.AspectBiz;
import com.imooc.test.base.UnitTestBase;

public class TestAOPAdvice extends UnitTestBase {

	public TestAOPAdvice() {
		super("spring-aop-advice.xml");
	}
	
	@Test
	public void test() {
		AspectBiz biz = super.getBean("aspectBiz");
		biz.say();
	}
	
	@Test
	public void testInit() {
		AspectBiz biz = super.getBean("aspectBiz");
		biz.init("abc", 2445);
	}
	

	
}
