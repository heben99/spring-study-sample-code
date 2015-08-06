package com.imooc.annotation.autoware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanAnnotationServiceConstructor {

	public AutoWareDAO autoWareDAO;
	public void say(String s) {
		System.out.println("AutoWareServiceConstructor say." );
		autoWareDAO.say(s);
	}
	
	@Autowired
	public BeanAnnotationServiceConstructor(AutoWareDAO dao) {
		this.autoWareDAO = dao;
	}
}
