package com.woniu.ch09;

import java.util.Scanner;

public class StudentBizTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentBiz stu = new StudentBiz();
		for (int i = 0; i < 5; i++) {
			System.out.print("������ѧ��������");
			String name = sc.next();
			stu.names[i] = name;
		}
		stu.show();
		System.out.println("\n�����뿪ʼ");
		int start = sc.nextInt();
		System.out.println("���������");
		int end = sc.nextInt();
		System.out.println("��˭��");
		String name = sc.next();
		boolean res = stu.searchName(start, end, name);
		if(res) {
			System.out.println("�ҵ���");
		}else {
			System.out.println("û�ҵ�");
		}
		sc.close();
	}

}
