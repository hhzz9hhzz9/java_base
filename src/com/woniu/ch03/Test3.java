package com.woniu.ch03;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("请输入会员号码(<4位整数>)：");
		int num = sc.nextInt();
		if (num>=1000 && num<=9999) {

			System.out.print("请输入会员生日(月/日<用两位数表示>)：");
			String birthday = sc.next();			

			System.out.print("请输入积分：");
		    int scores = sc.nextInt();
		    System.out.println();
		    System.out.println("已录入的会员信息是：");
			System.out.println(num + "\t" + birthday + "\t" + scores);
		}else {
			System.out.println("输入错误");
			sc.close();
		}
		
	}

}
