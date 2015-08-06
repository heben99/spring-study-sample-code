package com.imooc.test.bean;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.bean.BeanScope;
import com.imooc.test.base.UnitTestBase;

public class TestBeanScopePrototype extends UnitTestBase {

	
	
	public TestBeanScopePrototype() {
		super("spring-beanscope-prototype.xml");
	}

	@Test
	public void test() {
		BeanScope beanScope = super.getBean("BeanScope");
		beanScope.say();
		
		beanScope = super.getBean("BeanScope");
		beanScope.say();
	}


}
