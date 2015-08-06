package com.imooc.annotation;

import org.springframework.stereotype.Component;

@Component("testbean2")
public class BeanAnnotationNamed {
	public void say() {
		System.out.println(this.hashCode());
	}
}
