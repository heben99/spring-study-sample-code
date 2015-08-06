package com.imooc.annotation.multibean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {

	@Autowired
	private List<BeanInterface> list; 
	
	@Autowired
	private Map<String, BeanInterface> map;
	
	@Autowired
	@Qualifier("beanImplTwo")
	private BeanInterface beanInterface;
	
	public void say() {
		
		System.out.println("List<BeanInterface> list:");
		for (BeanInterface bean : list) {
			System.out.println(bean.getClass().getName());
		}
		
		System.out.println("Map<String, BeanInterface> map:");
		for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
		
		System.out.println("beanInterface:" + beanInterface.getClass().getName());
	}
}
