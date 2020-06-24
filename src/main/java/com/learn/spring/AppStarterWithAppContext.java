package com.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.learn.spring.service.MyService2;

public class AppStarterWithAppContext {

	public static void main(String[] args) {
		
		// 1. ApplicationContext using ClassPathXmlApplicationContext
		ApplicationContext cpAc = new ClassPathXmlApplicationContext("beans.xml");
		MyService2 bean = (MyService2) cpAc.getBean("myService2");
		bean.printMessage();
		
		// 2. ApplicationContext using FileSystemXmlApplicationContext
		ApplicationContext fsAc = new FileSystemXmlApplicationContext("C:/Farukh/Code/spring-basic-no-mvc/src/main/resources/beans.xml");
		MyService2 bean2 = (MyService2) fsAc.getBean("myService2");
		bean2.printMessage();
		
		// ApplicationContext with Explicit registerShutDownHook 
		AbstractApplicationContext cpAcWithSh = new ClassPathXmlApplicationContext("beans.xml");
		MyService2 bean0 = (MyService2) cpAcWithSh.getBean("myService2");
		bean0.printMessage();
		
		cpAcWithSh.registerShutdownHook();
		// For spring WEB application, it knows when to end the spring container. 
		// NO explicit registerShutDownHook is required.
		// But in case of desktop app, it is required.
		
	}

}
