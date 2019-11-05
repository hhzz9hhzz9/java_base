package com.woniu.ch05;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("消费记录；");
		double[] money = new double[5];
		double sum = 0.0;
		for (int i = 0; i < money.length; i++) {
			System.out.print("第" + (i + 1) + "笔购物金额：");
			money[i] = sc.nextDouble();
		}
		System.out.println("\n序号\t\t金额(元)");
		for (int i = 0; i < money.length; i++) {
			System.out.println((i + 1) + "\t\t" + money[i]);
			sum += money[i];
		}
		System.out.println("总金额\t\t" + sum);
		sc.close();
	}

}
