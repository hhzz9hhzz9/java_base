package com.woniu.ch04;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("�������" + i + "λ�˿͵�����");
			int age = sc.nextInt();
			if (age >= 30) {
				num++;
			}
		}
		System.out.println("30�����ϵı���Ϊ" + (num / 10.0) * 100 + "%");
		System.out.println("30�����µı���Ϊ" + (1.0 - num / 10.0) * 100 + "%");
		sc.close();
	}

}
