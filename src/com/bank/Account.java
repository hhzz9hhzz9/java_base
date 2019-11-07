package com.bank;

public class Account {
	double balance = 0;
	public void withdraw(double money) {
		
		if(money<=balance) {
			balance = balance-money;
			System.out.println("取款成功");
			System.out.println();
			System.out.println("余额为："+balance);			
		}else {
			System.out.println("取款失败");
			System.out.println();
			System.out.println("余额为："+balance);
		}

	}
	public void save(double money) {
		balance +=money;
		System.out.println("存款成功");
		System.out.println();
		System.out.println("余额为："+balance);
	}

}
