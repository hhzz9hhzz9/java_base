package com.woniu.ch05;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入4家店的价格");
		int[] num = new int[4];
		for (int i = 0; i < num.length; i++) {// 依次获取价格，并给数组赋值
			System.out.print("第" + (i + 1) + "家店的价格：");
			num[i] = sc.nextInt();
		}
		int min = num[0];// 设置一个中间变量，给予一个初始值
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {// 依次比较获得最小值
				min = num[i];
			}
		}
		System.out.println("最低价格是：" + min);
		sc.close();
	}

}
