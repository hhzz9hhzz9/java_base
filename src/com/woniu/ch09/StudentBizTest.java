package com.woniu.ch09;

import java.util.Scanner;

public class StudentBizTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentBiz stu = new StudentBiz();
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入学生姓名：");
			String name = sc.next();
			stu.names[i] = name;
		}
		stu.show();
		System.out.println("\n请输入开始");
		int start = sc.nextInt();
		System.out.println("请输入结束");
		int end = sc.nextInt();
		System.out.println("查谁：");
		String name = sc.next();
		boolean res = stu.searchName(start, end, name);
		if(res) {
			System.out.println("找到了");
		}else {
			System.out.println("没找到");
		}
		sc.close();
	}

}
