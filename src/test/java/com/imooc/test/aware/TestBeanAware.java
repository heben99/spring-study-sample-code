package com.imooc.test.aware;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.aware.BeanAware;
import com.imooc.test.base.UnitTestBase;

public class TestBeanAware extends UnitTestBase {

	public TestBeanAware()
	{
		super("spring-bean-aware.xml");
	}
	@Test
	public void test() {
		BeanAware beanAware = super.getBean("BeanAware");
	}

}
