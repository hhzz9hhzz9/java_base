package com.woniu.ch12.homework;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;

	public Account(int id, double balance, double annualInterestRate) {//�в�

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

	public void withdraw(double amount) {//ȡǮ
		if (amount <= this.balance) {
			System.out.println("���Ϊ��" + (this.balance - amount) + "\n������Ϊ��" + getMonthlyInterest() + "%");
			//setBalance(this.balance - amount);
			this.balance -= amount;
		} else {
			System.out.println("����\n���Ϊ��" + this.balance);
		}
	}

	public void deposit(double amount) {
		System.out.println("���Ϊ��" + (this.balance + amount) + "\n������Ϊ��" + getMonthlyInterest() + "%");
		//setBalance(this.balance + amount);
		this.balance+=amount;
	}

}
