package com.cui.beanWrapperTest;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;

public class BeanWrapperTest {
	public static void main(String[] args) {
		User user = new User();
		BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(user);
		beanWrapper.setPropertyValue("userName", "testName");
		System.out.println(user);

		PropertyValue propertyValue = new PropertyValue("pwd", "12345");
		beanWrapper.setPropertyValue(propertyValue);
		System.out.println(user);
	}
}

class User {
	private String userName;

	private String pwd;

	public String getUserName() {
		return userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User{" +
				"userName='" + userName + '\'' +
				", pwd='" + pwd + '\'' +
				'}';
	}
}
