package com.woniu.ch07;

public class Teacher {
	String teacherName;
	String teacherMajor;
	String teacherCourse;
	int teacherYear;
	
	public void teachShow() {
		System.out.println(teacherName);
		System.out.println("专业方向："+teacherMajor);
		System.out.println("教授课程："+teacherCourse);
		System.out.println("教龄："+teacherYear);
	}
	
}
