package com.woniu.ch03;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = sc.nextInt();
		if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
		sc.close();
	}

}
