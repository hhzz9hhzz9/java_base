package com.woniu.ch04;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("myShopping管理系统>客户信息管理>添加客户信息\n\n");
		int num1 = 0;//会员号	
		int num3 = 0;//会员生日
		String num2;//会员积分
		for (int i = 1; i <= 3; i++) {//循环录入会员信息
			System.out.print("会员号：");
			num1 = sc.nextInt();
			System.out.print("会员生日：");
			num2 = sc.next();
			System.out.print("会员积分：");
			num3 = sc.nextInt();
			if (num1 < 1000 || num1 > 9999) {
				System.out.println("录入失败");
				continue;
			}
			System.out.println("您的会员信息是：");
			System.out.println(num1 + "\t" + num2 + "\t" + num3);
		}
		System.out.println("结束");
		sc.close();
	}

}
