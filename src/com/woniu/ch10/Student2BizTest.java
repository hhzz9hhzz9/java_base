package com.woniu.ch10;

public class Student2BizTest {
	public static void main(String[] args) {
		//����ѧ������

		Student2 stu1 = new Student2();
		Student2 stu2 = new Student2();
		stu1.id = 10;
		stu1.name = "С��";
		stu1.age = 18;
		stu2.scores = 99;
		stu2.id = 11;
		stu2.name = "С��";
		stu2.age = 19;
		stu2.scores = 88;
		System.out.println("ѧ����Ϣ��");
		Student2Biz biz = new Student2Biz();//��ӵ�biz��
		biz.addName(stu1);
		biz.addName(stu2);
		biz.show();//��ʾѧ��

	}

}
