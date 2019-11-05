package com.woniu.ch07;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher teach = new Teacher();
		teach.teacherName = "王老师";
		teach.teacherMajor = "计算机";
		teach.teacherCourse = "使用激光Java语言理解程序逻辑";
		teach.teacherYear = 5;
		teach.teachShow();
	}

}
