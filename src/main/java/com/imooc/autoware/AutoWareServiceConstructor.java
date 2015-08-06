package com.imooc.autoware;

public class AutoWareServiceConstructor extends AutoWareService{

	public AutoWareServiceConstructor(AutoWareDAO dao) {
		this.autoWareDAO = dao;
	}
}
