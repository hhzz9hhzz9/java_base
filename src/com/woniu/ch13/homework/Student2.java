package com.woniu.ch13.homework;

public class Student2 extends Person2 {
	public int id;

	public Student2(String name, String sex, int age, int id) {
		super(name, sex, age);
		this.id = id;
	}
	public String say2() {
		return "Ñ§ºÅ£º"+id;
	}

	

}
