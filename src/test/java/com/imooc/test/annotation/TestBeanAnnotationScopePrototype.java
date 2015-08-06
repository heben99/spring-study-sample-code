package com.imooc.test.annotation;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.annotation.BeanAnnotation;
import com.imooc.annotation.BeanAnnotationScopePrototype;
import com.imooc.aware.BeanAware;
import com.imooc.test.base.UnitTestBase;

public class TestBeanAnnotationScopePrototype extends UnitTestBase {

	public TestBeanAnnotationScopePrototype() {
		super("spring-bean-annotation.xml");
	}

	@Test
	public void test() {
		// hint : first alpha of bean name is changed to lower case automatically.
		BeanAnnotationScopePrototype beanAnnotation = super.getBean("beanAnnotationScopePrototype");
		beanAnnotation.say();
		
		beanAnnotation = super.getBean("beanAnnotationScopePrototype");
		beanAnnotation.say();
		
	}
	
	

}
