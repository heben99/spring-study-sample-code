package com.imooc.annotation.autoware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanAnnotationServiceByType {

	public AutoWareDAO autoWareDAO;
	public void say(String s) {
		System.out.println("AutoWareServiceByType say." );
		autoWareDAO.say(s);
	}
	
	@Autowired
	public void setAutoWareDAO(AutoWareDAO dao) {
		this.autoWareDAO = dao;
	}
}
