package com.imooc.test.annotation;

import java.beans.BeanInfo;

import org.junit.Test;

import com.imooc.annotation.bean.Store;
import com.imooc.annotation.bean.StringStore;
import com.imooc.annotation.bean.inject.JsrService;
import com.imooc.annotation.bean.value.MyDriverManager;
import com.imooc.annotation.multibean.BeanInvoker;
import com.imooc.test.base.UnitTestBase;

public class TestBeanAnnotationAll extends UnitTestBase {

	public TestBeanAnnotationAll() {
		super("spring-bean-annotation.xml");
	}

	@Test
	public void testMultibeanInvoker()
	{
		BeanInvoker beanInvoker = super.getBean("beanInvoker");
		beanInvoker.say();
	}
	
	@Test
	public void testStoreConfig()
	{
		Store stringStore = super.getBean("stringStore");
		System.out.println("stringStore:" + stringStore.getClass().getName());
		
		Store integerStore = super.getBean("integerStore");
		System.out.println("integerStore:" + integerStore.getClass().getName());
	}
	
	@Test
	public void testMyDriverManager()
	{
		MyDriverManager myDriverManager = super.getBean("myDriverManager");
		
		System.out.println(myDriverManager.hashCode());
		
		myDriverManager = super.getBean("myDriverManager");
		System.out.println(myDriverManager.hashCode());
	}
	
	@Test
	public void testMyDriverManagerPrototype()
	{
		MyDriverManager myDriverManager = super.getBean("myDriverManagerPrototype");
		
		System.out.println(myDriverManager.hashCode());
		
		myDriverManager = super.getBean("myDriverManager");
		System.out.println(myDriverManager.hashCode());
	}
	
	@Test
	public void testInject()
	{
		JsrService jsrService = super.getBean("jsrService");
		jsrService.save();
	}
}
