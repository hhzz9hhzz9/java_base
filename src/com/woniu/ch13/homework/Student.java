package com.woniu.ch13.homework;

public class Student extends Person {
	public int id;
	public int score;
	public Student(String name, int age, int id, int score) {
		super(name, age);
		this.id = id;
		this.score = score;
	}
	@Override
	public String say() {
		return "����"+name+"��"+age+"�꣬ѧ����"+id+"���ɼ���"+score;
	}

}
