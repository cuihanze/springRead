package com.cui;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:spring.xml");
		BeanTest beanTest = (BeanTest) applicationContext.getBean("beanTest");
		System.out.println(beanTest);
	}
}
