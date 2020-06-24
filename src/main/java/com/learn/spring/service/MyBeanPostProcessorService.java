package com.learn.spring.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessorService implements BeanPostProcessor {
	
	// BeanPostProcessor will be called for all beans
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("MyBeanPostProcessorService#postProcessBeforeInitialization() called. beanName = "+beanName);
	
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("MyBeanPostProcessorService#postProcessAfterInitialization() called. beanName = "+beanName);
		
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
		
	}

}
