package com.imooc.annotation.autoware;

import org.springframework.stereotype.Repository;

@Repository
public class AutoWareDAO {

	public void say(String s) {
		System.out.println("AutoWareDAO say:" + s);
	}
}
