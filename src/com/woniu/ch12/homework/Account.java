package com.woniu.ch12.homework;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;

	public Account(int id, double balance, double annualInterestRate) {//有参

		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterest() {
		return this.annualInterestRate / 12;
	}

	public void withdraw(double amount) {//取钱
		if (amount <= this.balance) {
			System.out.println("余额为：" + (this.balance - amount) + "\n月利率为：" + getMonthlyInterest() + "%");
			//setBalance(this.balance - amount);
			this.balance -= amount;
		} else {
			System.out.println("余额不足\n余额为：" + this.balance);
		}
	}

	public void deposit(double amount) {
		System.out.println("余额为：" + (this.balance + amount) + "\n月利率为：" + getMonthlyInterest() + "%");
		//setBalance(this.balance + amount);
		this.balance+=amount;
	}

}
