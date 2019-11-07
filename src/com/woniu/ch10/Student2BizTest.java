package com.woniu.ch10;

public class Student2BizTest {
	public static void main(String[] args) {
		//创建学生对象

		Student2 stu1 = new Student2();
		Student2 stu2 = new Student2();
		stu1.id = 10;
		stu1.name = "小明";
		stu1.age = 18;
		stu2.scores = 99;
		stu2.id = 11;
		stu2.name = "小红";
		stu2.age = 19;
		stu2.scores = 88;
		System.out.println("学生信息：");
		Student2Biz biz = new Student2Biz();//添加到biz中
		biz.addName(stu1);
		biz.addName(stu2);
		biz.show();//显示学生

	}

}
