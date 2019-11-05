package com.woniu.ch04;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MyShopping购物管理系统>购物结算");
		System.out.println("\n\n****************************");
		System.out.println("1. 客户信息管理");
		System.out.println("2. 购物结算");
		System.out.println("3. 真情回馈");
		System.out.println("4. 注销");
		System.out.println("******************************\n");
		System.out.println("请选择，输入数字：");
		int num = sc.nextInt();
		do {
			System.out.println("请选择，输入数字：");
            num = sc.nextInt();
			System.out.println("错误，输入数字：");
			num = sc.nextInt();
		} while (num > 4);
		switch (num) {
		case 1:
			System.out.println("1. 客户信息管理");
			break;
		case 2:
			System.out.println("2. 购物结算");
			break;
		case 3:
			System.out.println("3. 真情回馈");
			break;
		case 4:
			System.out.println("4. 注销");
			break;
		}sc.close();

	}
}
