package com.woniu.ch03;

import java.util.Scanner;

public class GoodsList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		int pay = sc.nextInt();
		System.out.println("是否参加优惠换购：");
		System.out.println("1：满50元，加2元换购百事可乐一瓶");
		System.out.println("2：满100元，加3元换购500ml");
		System.out.println("3：满100元，加10元换购5公斤面粉");
		System.out.println("4：满200元，加10元换购1个苏泊尔烧菜锅");
		System.out.println("5：满200元，加20元换购欧莱雅爽肤水一瓶");
		System.out.println("0：不换购");
		System.out.print("请选择：");
		int num = sc.nextInt();
		switch (num) {
		case 0:
			System.out.println("本次消费金额：" + pay + "\n不换购");
			break;
		case 1:
			if (pay >= 50) {
				System.out.println("本次消费金额：" + (pay + 2) + "\n百事可乐一瓶");
				break;
			} else {
				System.out.println("金额不足");
			}
		case 2:
			if (pay >= 100) {
				System.out.println("本次消费金额：" + (pay + 3) + "\n500ml可乐一瓶");
				break;
			} else {
				System.out.println("金额不足");
			}
		case 3:
			if (pay >= 100) {
				System.out.println("本次消费金额：" + (pay + 10) + "\n5公斤面粉");
				break;
			} else {
				System.out.println("金额不足");
			}
		case 4:
			if (pay >= 200) {
				System.out.println("本次消费金额：" + (pay + 10) + "\n苏泊尔烧菜锅");
				break;
			} else {
				System.out.println("金额不足");
			}
		case 5:
			if (pay >= 200) {
				System.out.println("本次消费金额：" + (pay + 20) + "\n欧莱雅爽肤水");
				break;
			} else {
				System.out.println("金额不足");
			}
		}
		sc.close();
	}

}
