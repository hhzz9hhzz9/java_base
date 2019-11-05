package com.woniu.ch03;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		/* 输入会员积分 */
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入会员积分：");
		int scorse = sc.nextInt();
		/* 判断折扣 */
		double discont;
		if (scorse < 2000) {
			discont = 0.9;
		}else if (scorse >= 2000 && scorse <4000) {
			discont = 0.8;
		}else if (scorse >= 4000 && scorse <8000) {
			discont = 0.7;
		}else {
			discont = 0.6;
		}
		System.out.println("该会员享受的折扣是：" + discont);
		sc.close();
	}

}
