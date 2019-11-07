package com.woniu.ch10;

public class Student2Biz {
	Student2[] students = new Student2[30];

	public void addName(Student2 student) {//使用学生对象作为数组，存储所有学生信息
		for (int i = 0; i < this.students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	public void show() {
		System.out.println("本班学生列表：");
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].show();//调用数组中的元素student方法显示学生信息
			}
			
		}System.out.println();
	}

}
