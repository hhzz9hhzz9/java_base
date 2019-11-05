package com.woniu.ch04;

public class Homework5 {
	public static void main(String[] args) {
		int i;
//非13的倍数列表
		for (i = 1; i <= 100; i++) {
			if (i % 13 != 0) {
				System.out.println(i);
				continue;
			}
		}
	}

}
