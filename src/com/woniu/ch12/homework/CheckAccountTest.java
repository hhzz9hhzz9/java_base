package com.woniu.ch12.homework;

import java.util.Scanner;

public class CheckAccountTest {
	public static void main(String[] args) {
		int num;
		boolean flag;
		double amount;
		Scanner sc = new Scanner(System.in);
		CheckAccount acc = new CheckAccount(1122, 20000, 4.5, 5000);
		do {
			System.out.println("1ȡǮ2��Ǯ3�˳�");
			num = sc.nextInt();
			if (num == 1) {
				System.out.println("ȡ����Ǯ");
				amount = sc.nextDouble();
				acc.withdraw(amount);

				flag = true;
			} else if (num == 2) {
				System.out.println("�����Ǯ");
				amount = sc.nextDouble();
				acc.deposit(amount);

				flag = true;
			} else {
				System.out.println("ллʹ��");
				flag = false;
			}
		} while (flag);

		sc.close();
	}
}
