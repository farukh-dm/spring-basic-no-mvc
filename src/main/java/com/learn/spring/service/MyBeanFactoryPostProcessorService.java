package com.learn.spring.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessorService implements BeanFactoryPostProcessor {
	
	//BeanFactoryPostProcessor: Some code you want to run when Spring's bean factory itself gets initialized.
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanFactoryPostProcessorService#postProcessBeanFactory() called. beanName = "+beanFactory.toString());
		
	}
}
