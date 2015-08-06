package com.imooc.annotation.bean.inject;

import javax.inject.Inject;
import javax.inject.Named;



@Named
public class JsrService {

	@Inject
	private JsrDao jsrDao;
	
	/*@Inject
	public void setJstDao(JsrDao dao) {
		this.jsrDao = dao;
	}*/
	
	public void save() {
		jsrDao.save();
	}
}
