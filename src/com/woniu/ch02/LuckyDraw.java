package com.woniu.ch02;

import java.util.Scanner;

public class LuckyDraw {
	public static void main(String[] args) {
		/*
		 * 获取卡号
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入4位会员卡号：");
		int cardNum = sc.nextInt();
		/*
		 * 计算卡号各个位上的数字，并计算4位数和
		 */
		int gewei = cardNum % 10;
		int shiwei = cardNum / 10 % 10;
		int baiwei = cardNum / 100 % 10;
		int qianwei = cardNum / 1000;
		int sum = gewei + shiwei + baiwei + qianwei;
		boolean luckyMan = (gewei + shiwei + baiwei + qianwei) > 20;//判断幸运客户
		System.out.println("会员卡号" + cardNum + "各位数之和：" + sum);
		System.out.println("是幸运客户吗？" + luckyMan);
		sc.close();
	}

}
