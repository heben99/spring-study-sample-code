package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanAware implements ApplicationContextAware, BeanNameAware {

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("BeanAware.setBeanName:" + name);
	}

	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanAware.setApplicationContext:"
				+ arg0.getDisplayName());
	}

}
