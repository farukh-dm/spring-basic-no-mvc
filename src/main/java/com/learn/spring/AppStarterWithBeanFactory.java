package com.learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.learn.spring.service.MyService2;

public class AppStarterWithBeanFactory {

	public static void main(String[] args) {
		
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("C:/Farukh/Code/spring-basic-no-mvc/src/main/resources/beans.xml"));
		
		MyService2 bean = (MyService2) bf.getBean("myService2");
		bean.printMessage();
		
	}

}
