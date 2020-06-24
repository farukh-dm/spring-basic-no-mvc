package com.learn.spring.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service(value="myService5")
public class MyService5 implements InitializingBean, DisposableBean {
	
	public void printMessage() {
		System.out.println("MyService5#printMessage() called.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyService5#afterPropertiesSet() called.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("MyService5#destroy() called.");
	}

}
