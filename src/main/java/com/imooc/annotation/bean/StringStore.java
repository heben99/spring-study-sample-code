package com.imooc.annotation.bean;

public class StringStore implements Store<String> {

	public void init() {
		System.out.println("StringStore init");
	}
	
	public void destroy() {
		System.out.println("StringStore destroye");
	}
}
