package com.woniu.ch04;

public class Homework5 {
	public static void main(String[] args) {
		int i;
//��13�ı����б�
		for (i = 1; i <= 100; i++) {
			if (i % 13 != 0) {
				System.out.println(i);
				continue;
			}
		}
	}

}
