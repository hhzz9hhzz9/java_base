package com.woniu.ch10;

public class Student2Biz {
	Student2[] students = new Student2[30];

	public void addName(Student2 student) {//ʹ��ѧ��������Ϊ���飬�洢����ѧ����Ϣ
		for (int i = 0; i < this.students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	public void show() {
		System.out.println("����ѧ���б�");
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].show();//���������е�Ԫ��student������ʾѧ����Ϣ
			}
			
		}System.out.println();
	}

}
