package com.imooc.annotation.bean.value;

public class MyDriverManager {
	public MyDriverManager(String url, String name, String pwd) {
		System.out.println("url:" + url);
		System.out.println("name:" + name);
		System.out.println("password:" + pwd);
	}
}
