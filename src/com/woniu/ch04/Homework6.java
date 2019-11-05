package com.woniu.ch04;

public class Homework6 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 1; i <= 100; i++) {//100以内奇数的和
			if (i % 2 == 0) {
				continue;
			}
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
