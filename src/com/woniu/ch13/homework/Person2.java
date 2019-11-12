package com.woniu.ch13.homework;

public class Person2 {
	public String name,sex;
	public int age;
	public Person2() {
	
	}
	public Person2(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String say() {
		return "姓名："+name+"，年龄："+age+"，性别："+sex;
	}
	
}
