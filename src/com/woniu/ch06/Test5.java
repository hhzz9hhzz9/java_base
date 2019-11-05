package com.woniu.ch06;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay, num;
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入第" + (i + 1) + "个人所购买的三件商品价格");
			num = 0;
			for (int j = 0; j < 3; j++) {

				System.out.print("请输入第" + (j + 1) + "件价格");
				pay = sc.nextInt();
				if (pay < 300) {
					continue;
				}
				num++;
				System.out.println("第" + (i + 1) + "个人共有" + num + "件商品享受优惠！");
			}
		}
         sc.close();
	}

}
