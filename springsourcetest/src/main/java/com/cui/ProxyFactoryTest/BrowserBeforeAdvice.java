package com.cui.ProxyFactoryTest;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BrowserBeforeAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		encrypt();
	}

	//加密
	private void encrypt() {
		System.out.println("encrypt ...");
	}
}
