package com.imooc.test.annotation;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.annotation.BeanAnnotation;
import com.imooc.annotation.BeanAnnotationNamed;
import com.imooc.aware.BeanAware;
import com.imooc.test.base.UnitTestBase;

public class TestBeanAnnotationName extends UnitTestBase {

	public TestBeanAnnotationName() {
		super("spring-bean-annotation.xml");
	}

	@Test
	public void test() {
		// hint : first alpha of bean name is changed to lower case automatically.
		BeanAnnotationNamed beanAnnotation = super.getBean("testbean2");
		beanAnnotation.say();
		
		beanAnnotation = super.getBean("testbean2");
		beanAnnotation.say();
		
	}
	
	

}
