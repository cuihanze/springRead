package com.cui.conversionServiceTest.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:spring.xml");
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student);
	}
}
