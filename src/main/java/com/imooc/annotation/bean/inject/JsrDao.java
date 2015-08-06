package com.imooc.annotation.bean.inject;

import org.springframework.stereotype.Repository;

@Repository
public class JsrDao {

	public void save() {
		System.out.println("jsr dao saved.");
	}
}
