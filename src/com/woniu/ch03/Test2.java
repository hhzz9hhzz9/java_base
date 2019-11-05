package com.woniu.ch03;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//创建Scanner

		System.out.println("我行我素购物管理系统> 幸运抽奖");//提示信息
		System.out.println("\t");
		
		System.out.print("请输入4位会员号码：");
		int luckyNum = sc.nextInt();//获取用户号码
		
		int random = (int)(Math.random() * 10);//产生幸运数字
		int baiwei = luckyNum / 100 % 10;//获取百位数字
		/*
		 * 判断是否中奖号
		 */
		if(baiwei == random) {
			System.out.println(luckyNum + "号是幸运客户，获得MP3一个。");
		}else {
			System.out.println(luckyNum + "号客户，谢谢您的支持！");
			sc.close();
		}
		
	}

}
