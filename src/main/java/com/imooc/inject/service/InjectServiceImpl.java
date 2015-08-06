package com.imooc.inject.service;

import com.imooc.inject.dao.InjectDAO;

public class InjectServiceImpl implements InjectService {

	InjectDAO injectDAO = null;
	
/*	public InjectDAO getInjectDAO() {
		return injectDAO;
	}*/

	public void setInjectDAO(InjectDAO dao) {
		this.injectDAO = dao;
	}

	public InjectServiceImpl(InjectDAO dao) {
		injectDAO = dao;
	}
	
	public InjectServiceImpl() {}
	
	public void save(String s) {
		System.out.println("InjectServiceImpl开始");
		try {
			injectDAO.save(s);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString() + ". InjectServiceImpl中injectDAO.save(s)执行出错，injectDAO可能并未正确初始化");
		}
			
		
		System.out.println("InjectServiceImpl结束");
	}

}
