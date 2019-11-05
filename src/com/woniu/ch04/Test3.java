package com.woniu.ch04;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("MyShopping购物管理系统>购物结算");
		System.out.println("\n\n****************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("******************************");
		Scanner sc = new Scanner(System.in);
		/*
		 * 定义变量
		 */
		double price = 0.0;
		String answer = "y";
		String name = "";
		double discont = 0.8;
		double total = 0.0;
		int num2 = 0;
		/*
		 * 购物价格计算
		 */
		while (answer.equals("y")) {
			System.out.print("请输入商品编号：");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				name = "T恤";
				price = 245.0;
				break;
			case 2:
				name = "网球拍";
				price = 500.0;
				break;
			case 3:
				name = "网球鞋";
				price = 1000.0;
				break;
			}
			System.out.print("请输入商品数量：");
			num2 = sc.nextInt();
			total = total + price*num2;
			System.out.println(name + "￥" + price+"\t数量"+num2+"\t合计"+price*num2);
			System.out.print("是否继续（y/n）");
			answer = sc.next();
		}
		/*
		 * 结算界面
		 */		
		System.out.println("折扣：" + discont);
		System.out.println("应付金额：" + (discont * total));

		System.out.print("实付金额：");
		double payment = sc.nextDouble();

		while (payment - (discont * total) < 0) {
			System.out.print("金额不足，请重新输入：");
			payment = sc.nextDouble();
		}
		System.out.println("找零：" + (payment - discont * total));
		sc.close();
	}

}
