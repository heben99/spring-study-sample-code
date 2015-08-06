package com.imooc.lifecycle;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleByInteface implements InitializingBean, DisposableBean{

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BeanLifeCycleByInteface destroyed");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BeanLifeCycleByInteface afterPropertiesSet");
	}


}
