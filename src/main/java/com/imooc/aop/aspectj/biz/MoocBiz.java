package com.imooc.aop.aspectj.biz;

import org.springframework.stereotype.Component;

@Component
public class MoocBiz {

	public void say() {
		System.out.println("MoocBiz say.");
	}
	
	public void sayException() throws Exception{
		throw new Exception("error");
	}
	
	public void say(String s) {
		System.out.println("MoocBiz say:" + s);
	}
}
