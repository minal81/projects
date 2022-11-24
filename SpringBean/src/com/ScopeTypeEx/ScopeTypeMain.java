package com.ScopeTypeEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTypeMain {
	public static void main(String arg[]) {
	ApplicationContext beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
	ScopeType myBean=(ScopeType) beanFactory.getBean("ScopeBean");
    System.out.println("name: "+myBean.getName());

	ScopeType myBean1=(ScopeType) beanFactory.getBean("ScopeBean");
	myBean1.setName("ashish");
	System.out.println("name: "+myBean1.getName());
	
	ScopeType myBean2=(ScopeType) beanFactory.getBean("ScopeBean");
	myBean2.setName("sayali");
	System.out.println("name: "+myBean2.getName());
	System.out.println(myBean1==myBean2);
	System.out.println(myBean1+" \n "+myBean2);
	
}}

