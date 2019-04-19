package com.cui.ProxyFactoryTest;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class BrowserAfterReturningAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		decrypt();
	}

	//解密
	private void decrypt(){
		System.out.println("decrypt ...");
	}
}
