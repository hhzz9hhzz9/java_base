package com.woniu.ch10;

import java.util.Scanner;

public class NumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Number num = new Number();
		boolean flag;
		do {
			System.out.println("���������֤�ţ�");
			String id = sc.next();
			System.out.println(id.length());
			System.out.println("�������ֻ��ţ�");
			String phone1 = sc.next();
			System.out.println("�����������ţ�");
			String phone2 = sc.next();
			flag = num.verify(id, phone1, phone2);
		} while (flag);
		sc.close();
	}

}
