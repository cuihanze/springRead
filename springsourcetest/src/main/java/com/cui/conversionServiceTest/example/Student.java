package com.cui.conversionServiceTest.example;

import java.util.Date;

public class Student {
	private String name;

	private Date birthday;

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", birthday=" + birthday +
				'}';
	}
}
