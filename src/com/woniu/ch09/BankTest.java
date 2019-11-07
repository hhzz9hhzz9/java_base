package com.woniu.ch09;

import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount();
		Customer cust = new Customer();
		bank.cid = 6666;
		bank.balance = 10000;
		cust.name = "小明";
		cust.id = "12345";
		cust.call = 8189800;
		cust.dizhi = "蜗牛学院";
		System.out.println("取多少钱？");
		int money = sc.nextInt();
		if (bank.withdraw(money)) {
			System.out.println("取钱成功");
			System.out.println("余额为：" + bank.balance);
		}else {
			System.out.println("取钱失败");
		}
		System.out.println("存多少钱？");
		money = sc.nextInt();
		if (bank.save(money)) {
			System.out.println("存钱成功");
			System.out.println("余额为：" + bank.balance);
		}else {
			System.out.println("存钱失败");
		}
		System.out.println(bank.getInfo());
		System.out.println(cust.say());
		sc.close();

	}
}
