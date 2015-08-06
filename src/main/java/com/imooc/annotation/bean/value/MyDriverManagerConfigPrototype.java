package com.imooc.annotation.bean.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("config.xml")
public class MyDriverManagerConfigPrototype {
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String name;
	
	@Value("${jdbc.password}")
	private String pwd;
	
	@Bean
	@Scope(value="prototype")
	public MyDriverManager myDriverManagerPrototype() {
		return new MyDriverManager(url, name, pwd);
	}
}
