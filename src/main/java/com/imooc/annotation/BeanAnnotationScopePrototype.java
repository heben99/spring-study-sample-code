package com.imooc.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanAnnotationScopePrototype {
	public void say() {
		System.out.println(this.hashCode());
	}
}
