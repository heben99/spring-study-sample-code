package com.imooc.test.ioc.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.inject.service.InjectService;
import com.imooc.inject.service.InjectServiceImpl;
import com.imooc.test.base.UnitTestBase;

public class TestInjectServiceImplConstructor extends UnitTestBase {

	
	public TestInjectServiceImplConstructor() {
		super("spring-inject-constructor.xml");
		// TODO Auto-generated constructor stub
	}

	@Test
	public void test() {
		InjectService injectService = super.getBean("InjectService");
		injectService.save("通过构造函数方式注入的数据");
		
	}

	
}
