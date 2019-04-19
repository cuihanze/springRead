package com.cui.ProxyFactoryTest;

public class ChromeBrowser implements Browser {
	@Override
	public void visitInternet() {
		System.out.println("visit YouTube");
	}

	@Override
	public void test() {
		this.visitInternet();
	}
}
