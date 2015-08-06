package com.imooc.test.autoware;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imooc.autoware.AutoWareServiceByType;
import com.imooc.test.base.UnitTestBase;



public class TestAutoWareServiceByType extends UnitTestBase {

	public TestAutoWareServiceByType() {
		super("spring-autoware-by-type.xml");
	}

	@Test
	public void test() {
		AutoWareServiceByType serviceBean = super.getBean("AutoWareServiceByType");
		serviceBean.say("ByType");
	}

}
