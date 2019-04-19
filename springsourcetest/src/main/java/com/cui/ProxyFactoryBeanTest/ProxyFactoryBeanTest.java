package com.cui.ProxyFactoryBeanTest;

import com.cui.ProxyFactoryTest.Browser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:proxyFactoryBean.xml");
		Browser browser = (Browser) context.getBean("browserProxy");
		browser.visitInternet();
	}
}
