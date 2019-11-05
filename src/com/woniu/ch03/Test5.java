package com.woniu.ch03;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		/*
		 * 收集客户资料和客户信息
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入是否是会员：是(y)/否(其他字符)");
		String answer = sc.next();
		System.out.println("请输入购物金额：");
		double pay = sc.nextDouble();
		double money;
		
		if (answer.equals("y")) {            //判断会员资格
			if (pay >= 200) {                //判断购物金额
				money = pay * 0.75;
			}else {
				money = pay * 0.8;
			}
		}else {
			if (pay >= 100) {                 //判断购物金额
				money = pay * 0.9;
			}else {
				money = pay;
			}
		}
		System.out.println("实际支付：" + money);
		sc.close();
	}

}
