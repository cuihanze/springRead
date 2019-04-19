package com.cui.defaultAdvisorAutoProxyCreator;

import com.cui.ProxyFactoryTest.Browser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultAdvisorAutoProxyCreatorTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:defaultAdvisorAutoProxyCreator.xml");
		Browser browser = (Browser) context.getBean("chromeBrowser");
		browser.visitInternet();
	}
}
