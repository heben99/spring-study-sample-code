package com.imooc.test.base;


import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {

	public ClassPathXmlApplicationContext context = null;
	private String springXmlPath = null;
	
	public UnitTestBase(String path)
	{
		springXmlPath = path;
	}

	
	
	@Before
	public void before()
	{
		/*if (StringUtils.isEmpty(springXmlPath))
			springXmlPath = "classpath*:spring-*.xml";*/
		try {
/*			String[] s = springXmlPath.split("[,\\s]+");
			for (String str : s) {
				System.out.println("springXmlPath.split:" + str);
			}*/
			context = new ClassPathXmlApplicationContext(springXmlPath);
			context.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("UnitTestBase.ClassPathXmlApplicationContext初始化失败，可能xml文件路径配置不对");
		}
	}
	
	@After
	public void after()
	{
		if (context.isRunning())
			context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String name) {
		try {
			return (T)context.getBean(name);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bean " + name + " not found");
			return null;
		}
	}
}
