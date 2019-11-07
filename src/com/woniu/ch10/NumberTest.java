package com.woniu.ch10;

import java.util.Scanner;

public class NumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Number num = new Number();
		boolean flag;
		do {
			System.out.println("请输入身份证号：");
			String id = sc.next();
			System.out.println(id.length());
			System.out.println("请输入手机号：");
			String phone1 = sc.next();
			System.out.println("请输入座机号：");
			String phone2 = sc.next();
			flag = num.verify(id, phone1, phone2);
		} while (flag);
		sc.close();
	}

}
