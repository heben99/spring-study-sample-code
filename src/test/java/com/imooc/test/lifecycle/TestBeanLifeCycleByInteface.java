package com.imooc.test.lifecycle;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.lifecycle.BeanLifeCycle;
import com.imooc.lifecycle.BeanLifeCycleByInteface;
import com.imooc.test.base.UnitTestBase;

public class TestBeanLifeCycleByInteface extends UnitTestBase {

	public TestBeanLifeCycleByInteface() {
		super("spring-bean-lifecycle-by-interface.xml");
	}
	@Test
	public void test() {
		BeanLifeCycleByInteface beanLifeCycleByInteface = super.getBean("BeanLifeCycleByInteface");
	}

}
