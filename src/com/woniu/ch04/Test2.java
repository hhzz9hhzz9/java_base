package com.woniu.ch04;

public class Test2 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		while(num<=100) {
			if (num%2==0) {
						sum = sum + num;
						num++;
			}else {
				num++;
			}
		}
		System.out.println(sum);
	}

}
