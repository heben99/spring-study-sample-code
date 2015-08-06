package com.imooc.annotation.bean.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("config.xml")
public class MyDriverManagerConfig {
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String name;
	
	@Value("${jdbc.password}")
	private String pwd;
	
	@Bean
	public MyDriverManager myDriverManager() {
		return new MyDriverManager(url, name, pwd);
	}
}
