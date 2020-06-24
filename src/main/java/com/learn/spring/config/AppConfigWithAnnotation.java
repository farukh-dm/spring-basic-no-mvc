package com.learn.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.spring.service.MyService;
import com.learn.spring.service.MyService2;
import com.learn.spring.service.MyService3;

@Configuration
@ComponentScan(basePackages = "com.learn.spring")
public class AppConfigWithAnnotation {
	
	@Bean(value="myService")
	public MyService getMyService() {
		return new MyService();
	}
	
	@Bean(value="myServiceCopy")
	public MyService getMyServiceCopy() {
		return new MyService();
	}
	
	@Bean(name = "myService2")
	public MyService2 getMyService2() {
		return new MyService2();
	}
	
	@Bean
	public MyService3 getMyService3() {
		return new MyService3();
	}
	
}

