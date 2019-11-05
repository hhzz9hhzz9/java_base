package com.woniu.ch04;

public class Homework3 {
	public static void main(String[] args) {
		int i;
		int num1=0,num2 = 0;
//	for (i = 0; i < 100; i++) {
//			if (i % 6 == 0 && i != 0) {
//				num++;
//			}
//		}
		for (i = 0; i < 100; i++) {//6的倍数	
			if (i % 6 == 0 && i != 0) {
				num1++;
			}	
			if (i % 3 == 0 && i % 7 == 0 && i != 0) {// 3和7的公倍数
				num2++;
			}
		}
		System.out.println(num1);
		System.out.println(num2);
	}

}
