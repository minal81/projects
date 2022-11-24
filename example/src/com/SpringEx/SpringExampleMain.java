package com.SpringEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringExampleMain {

	public static void main(String[] args) {
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("SpringExampleBean.xml");
		SpringExample myBean=(SpringExample) beanFactory.getBean("SpringExampleBean");
		myBean.printname();

	}

}
