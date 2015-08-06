package com.imooc.inject.dao;

public class InjectDAOImpl implements InjectDAO {

	
	public void save(String s) {
		System.out.println("数据库执行了:" + s);
	}

}
