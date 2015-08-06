package com.imooc.autoware;

public abstract class AutoWareService {

	public AutoWareDAO autoWareDAO;
	
	public void say(String s) {
		System.out.println("AutoWareService say2." );
		if (null != autoWareDAO) {
			try {
				autoWareDAO.say(s);
			} catch (Exception e) {
				System.out.println("AutoWareService.autoWareDAO未被正确初始化");
			}
		}
		else
			System.out.println("AutoWareService.autoWareDAO == null");
	}
	
	public void say2(String s) {
		System.out.println("AutoWareService say." );
		autoWareDAO.say(s);
	}
}
