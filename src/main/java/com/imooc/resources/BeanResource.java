package com.imooc.resources;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class BeanResource implements ApplicationContextAware{

	public Resource resource = null;
	public ApplicationContext applicationContext = null;
	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		applicationContext = context;
	}

	public void showResource(String s)
	{
		resource = applicationContext.getResource(s);
		System.out.println("resource name:" + resource.getFilename());
		try {
			System.out.println("resource length:" + resource.contentLength());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Resource读取文件长度时出错");
		}
	}
}
