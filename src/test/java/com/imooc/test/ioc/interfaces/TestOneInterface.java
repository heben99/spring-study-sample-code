package com.imooc.test.ioc.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.ioc.interfaces.OneInterface;
import com.imooc.test.base.UnitTestBase;


public class TestOneInterface extends UnitTestBase {

	public TestOneInterface()
	{
		super("spring-ioc.xml");
	}
	@Test
	public void testSay() {
		OneInterface oneInterface = super.getBean("OneInterface");
		if (null != oneInterface) 
			oneInterface.say("TestOneInterface say");
	}

}
