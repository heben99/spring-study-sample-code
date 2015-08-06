package com.imooc.test.annotation.autoware;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.annotation.autoware.BeanAnnotationServiceByProperty;
import com.imooc.annotation.autoware.BeanAnnotationServiceByType;
import com.imooc.annotation.autoware.BeanAnnotationServiceConstructor;
import com.imooc.test.base.UnitTestBase;

public class TestAnnotationAutowired extends UnitTestBase {

	public TestAnnotationAutowired() {
		super("spring-bean-annotation.xml");
	}

	@Test
	public void testProperty() {
		BeanAnnotationServiceByProperty bean = super
				.getBean("beanAnnotationServiceByProperty");
		bean.say("testProperty");
	}

	@Test
	public void testByType() {
		BeanAnnotationServiceByType bean = super
				.getBean("beanAnnotationServiceByType");
		bean.say("testByType");
	}

	@Test
	public void testConstructor() {
		BeanAnnotationServiceConstructor bean = super
				.getBean("beanAnnotationServiceConstructor");
		bean.say("testConstructor");
	}

}
