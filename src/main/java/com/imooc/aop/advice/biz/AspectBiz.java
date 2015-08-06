package com.imooc.aop.advice.biz;

import org.springframework.stereotype.Component;


public class AspectBiz {
	public void say() {
		System.out.println(this.hashCode());
	}
	
	public void init(String s, int a) {
		System.out.println("init:" + s + "," + a);
	}
}
