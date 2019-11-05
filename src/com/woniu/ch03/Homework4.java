package com.woniu.ch03;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		if(sc.hasNextInt()) {
			int year = sc.nextInt();
			switch (year%12) {
			case 0:
				System.out.println("猴年");
				break;
			case 1:
				System.out.println("鸡年");
				break;
			case 2:
				System.out.println("狗年");
				break;
			case 3:
				System.out.println("猪年");
				break;
			case 4:
				System.out.println("鼠年");
				break;
			case 5:
				System.out.println("牛年");
				break;
			case 6:
				System.out.println("虎年");
				break;
			case 7:
				System.out.println("兔年");
				break;
			case 8:
				System.out.println("龙年");
				break;
			case 9:
				System.out.println("蛇年");
				break;
			case 10:
				System.out.println("马年");
				break;
			case 11:
				System.out.println("羊年");
				break;
			}
		}else {
			System.out.println("非法参数");
		}
		sc.close();
	}

}
