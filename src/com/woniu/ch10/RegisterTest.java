package com.woniu.ch10;

import java.util.Scanner;

public class RegisterTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Register reg = new Register();

		boolean res;
		do {
			System.out.println("�û�����");
			String name = sc.next();
			System.out.println("���룺");
			String pwd1 = sc.next();
			System.out.println("�ظ����룺");
			String pwd2 = sc.next();
			res = reg.verify(name, pwd1, pwd2);
		} while (res);
		sc.close();

	}
}
