package com.imooc.annotation.autoware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanAnnotationServiceByProperty {

	@Autowired
	public AutoWareDAO autoWareDAO;
	
	public void say(String s) {
		System.out.println("AutoWareServiceByProperty say." );
		autoWareDAO.say(s);
	}
	

}
