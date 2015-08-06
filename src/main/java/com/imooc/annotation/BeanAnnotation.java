package com.imooc.annotation;

import org.springframework.stereotype.Component;

@Component
public class BeanAnnotation {
	public void say() {
		System.out.println(this.hashCode());
	}
}
