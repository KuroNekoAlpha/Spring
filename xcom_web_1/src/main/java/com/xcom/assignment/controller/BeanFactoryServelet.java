package com.xcom.assignment.controller;

import org.springframework.beans.BeansException;

public interface BeanFactoryServelet{
	
	<T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
