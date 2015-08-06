package com.imooc.test.lifecycle;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.lifecycle.BeanLifeCycle;
import com.imooc.test.base.UnitTestBase;

public class TestBeanLifeCycle extends UnitTestBase {

	public TestBeanLifeCycle() {
		super("spring-bean-lifecycle.xml");
	}
	@Test
	public void test() {
		BeanLifeCycle beanLifeCycle = super.getBean("BeanLifeCycle");
	}

}
