package com.imooc.test.aop;

import org.junit.Test;
import org.junit.runners.JUnit4;

import com.imooc.aop.advice.aspect.parent.Fit;
import com.imooc.aop.advice.biz.AspectBiz;
import com.imooc.test.base.UnitTestBase;

public class TestAOPAdviceParentFit extends UnitTestBase {

	public TestAOPAdviceParentFit() {
		super("spring-aop-advice-parent.xml");
	}
	
	@Test
	public void test() {
		Fit fit = super.getBean("aspectBiz");
		fit.hello();
	}

	

	
}
