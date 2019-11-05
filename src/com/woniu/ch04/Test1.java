package com.woniu.ch04;

public class Test1 {
	public static void main(String[] args) {
		double num = 25;
		int year = 2012;
		while (num<=100) {
			num = num*(1+0.25);
			year++;
		}
		System.out.println(year);

	}

}
