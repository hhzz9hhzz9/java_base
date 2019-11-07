package com.woniu.ch10.homework;

import java.util.Scanner;

public class MathLibTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MathLib math = new MathLib();
		String a, b;
		boolean aFlag = false, bFlag = false;
		System.out.print("a=");
		if (sc.hasNextDouble() || sc.hasNextInt()) {
			a = sc.next();
			aFlag = true;
		} else {
			a = sc.next();
		}
		System.out.print("b=");
		if (sc.hasNextDouble() || sc.hasNextInt()) {
			b = sc.next();
			bFlag = true;
		} else {
			b = sc.next();
		}
		System.out.println("1加法，2减法，3乘法，4除法：");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			if (aFlag && bFlag) {
				double c = math.jiafa2(a, b);
				System.out.println(c);
			} else {
				System.out.println(math.jiafa1(a, b));
			}
			break;
		case 2:
			double c = math.jianfa(a, b);
			System.out.println(c);
			break;
		case 3:
			double c1 = math.chengfa(a, b);
			System.out.println(c1);
			break;
		case 4:
			double c2 = math.chufa(a, b);
			System.out.println(c2);
			break;
		}
		sc.close();
		
	}

}
