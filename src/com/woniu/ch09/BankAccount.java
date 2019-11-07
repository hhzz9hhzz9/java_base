package com.woniu.ch09;

public class BankAccount {
	int cid;
	int balance = 0;
	public String getInfo() {
		String res = "ø®∫≈£∫"+cid+"\n”‡∂Ó£∫"+balance;
		return res;
	}
	public boolean withdraw(int money) {
		boolean answer = false;
		if(money<=balance) {
			balance = balance-money;
			answer = true;						
		}
		return answer;
	}
	public boolean save(int money) {
		boolean answer = false;
		if(money > 0) {
			balance = balance + money;
			answer = true;	
		}
		return answer;
	}

}
