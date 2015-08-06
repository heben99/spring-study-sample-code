package com.imooc.test.annotation;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.annotation.BeanAnnotation;
import com.imooc.aware.BeanAware;
import com.imooc.test.base.UnitTestBase;

public class TestBeanAnnotation extends UnitTestBase {

	public TestBeanAnnotation() {
		super("spring-bean-annotation.xml");
	}

	@Test
	public void test() {
		// hint : first alpha of bean name is changed to lower case automatically.
		BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
		beanAnnotation.say();
		
		beanAnnotation = super.getBean("beanAnnotation");
		beanAnnotation.say();
		
	}
	
	

}
