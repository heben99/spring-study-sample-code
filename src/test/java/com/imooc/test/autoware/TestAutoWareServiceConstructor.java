package com.imooc.test.autoware;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.autoware.AutoWareServiceByType;
import com.imooc.autoware.AutoWareServiceConstructor;
import com.imooc.test.base.UnitTestBase;



public class TestAutoWareServiceConstructor extends UnitTestBase {

	public TestAutoWareServiceConstructor() {
		super("spring-autoware-constructor.xml");
	}

	@Test
	public void test() {
		AutoWareServiceConstructor serviceBean = super.getBean("AutoWareServiceConstructor");
		serviceBean.say("Constructor");
	}

}
