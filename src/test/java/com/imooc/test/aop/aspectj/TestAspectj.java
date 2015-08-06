package com.imooc.test.aop.aspectj;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.aop.aspectj.biz.MoocBiz;
import com.imooc.test.base.UnitTestBase;

public class TestAspectj extends UnitTestBase {

	public TestAspectj() {
		super("spring-aop-aspectj.xml");
	}
	@Test
	public void test() {
		MoocBiz biz = super.getBean("moocBiz");
		biz.say();
	}

	@Test
	public void testException() throws Exception {
		MoocBiz biz = super.getBean("moocBiz");
		biz.sayException();
	}
	
	
	@Test
	public void testArgs() {
		MoocBiz biz = super.getBean("moocBiz");
		biz.say("argument");
	}
}
