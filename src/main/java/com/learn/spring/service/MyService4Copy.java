package com.learn.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

//@Service
public class MyService4Copy {
	
	//@Autowired
	private MyService4 myService4;
	
	public void printMessage() {
		
		//myService4.printMessage();
		System.out.println("MyService4Copy#printMessage() called.");
	}


	//@Required
	public void setMyService4(MyService4 myService4) {
		this.myService4 = myService4;
	}
	
}
