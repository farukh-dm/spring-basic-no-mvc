package com.learn.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.spring.config.AppConfigWithAnnotation;
import com.learn.spring.service.MyService;
import com.learn.spring.service.MyService2;
import com.learn.spring.service.MyService3;
import com.learn.spring.service.MyService4;
import com.learn.spring.service.MyService5;

public class AppStarterWithAnnotationConfig {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = 
			new AnnotationConfigApplicationContext(AppConfigWithAnnotation.class);
		
		MyService bean0 = (MyService) ac.getBean("myService");
		bean0.printMessage();
		
		MyService bean1 = (MyService) ac.getBean("myServiceCopy");
		bean1.printMessage();
		
		MyService2 bean2 = (MyService2) ac.getBean("myService2");
		bean2.printMessage();
		
		MyService3 bean3 = (MyService3) ac.getBean(MyService3.class);
		bean3.printMessage();
		
		MyService4 bean4 = (MyService4) ac.getBean(MyService4.class);
		bean4.printMessage();
		
		MyService5 bean5 = (MyService5) ac.getBean(MyService5.class);
		bean5.printMessage();
		
		ac.registerShutdownHook();
		
	}

}
