package com.cui.ProxyFactoryTest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BrowserAroundAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		encrypt();
		Object retVal = invocation.proceed();
		decrypt();
		return retVal;
	}

	// 加密
	private void encrypt(){
		System.out.println("encrypt ...");
	}

	// 解密
	private void decrypt(){
		System.out.println("decrypt ...");
	}

}
