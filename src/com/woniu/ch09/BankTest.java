package com.woniu.ch09;

import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount();
		Customer cust = new Customer();
		bank.cid = 6666;
		bank.balance = 10000;
		cust.name = "С��";
		cust.id = "12345";
		cust.call = 8189800;
		cust.dizhi = "��ţѧԺ";
		System.out.println("ȡ����Ǯ��");
		int money = sc.nextInt();
		if (bank.withdraw(money)) {
			System.out.println("ȡǮ�ɹ�");
			System.out.println("���Ϊ��" + bank.balance);
		}else {
			System.out.println("ȡǮʧ��");
		}
		System.out.println("�����Ǯ��");
		money = sc.nextInt();
		if (bank.save(money)) {
			System.out.println("��Ǯ�ɹ�");
			System.out.println("���Ϊ��" + bank.balance);
		}else {
			System.out.println("��Ǯʧ��");
		}
		System.out.println(bank.getInfo());
		System.out.println(cust.say());
		sc.close();

	}
}
