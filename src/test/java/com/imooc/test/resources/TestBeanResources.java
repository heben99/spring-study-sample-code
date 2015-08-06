package com.imooc.test.resources;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.springframework.core.io.Resource;

import com.imooc.resources.BeanResource;
import com.imooc.test.base.UnitTestBase;

public class TestBeanResources extends UnitTestBase {

	
	public TestBeanResources() {
		super("spring-resource.xml");
	}

	@Test
	public void test() {
		BeanResource beanResources = super.getBean("BeanResource");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		beanResources.showResource("config.txt");
	}
	

	@Test
	public void testClassPath() {
		BeanResource beanResources = super.getBean("BeanResource");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		beanResources.showResource("classpath:config.txt");
	}
	

	@Test
	public void testFile() {
		BeanResource beanResources = super.getBean("BeanResource");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		beanResources.showResource("file:D:/Study/MyEclipse for Spring Project/springtest/src/main/resources/config.txt");
	}
	
	
	@Test
	public void testHttp() {
		BeanResource beanResources = super.getBean("BeanResource");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		beanResources.showResource("http://blog.sina.com.cn/s/blog_4a4f9fb50101eyfp.html");
	}
	

}
