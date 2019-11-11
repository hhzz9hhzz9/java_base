package com.woniu.ch12.homework;

public class CheckAccount extends Account{
	private double overdraft;
	
	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	
	public double getOverdraft() {
		return overdraft;
	}


	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}


	@Override
	public void withdraw(double amount) {
		if (amount <= getBalance()) {
			System.out.println("余额为：" + (getBalance()-amount)+"\n可透支额度为："+this.overdraft);
			setBalance(getBalance()-amount);
		} else {
			if(amount <= getBalance()+ this.overdraft) {
				System.out.println("余额为：" + 0+"\n可透支额度为："+(getBalance()+ this.overdraft - amount));
				setOverdraft(getBalance()+ this.overdraft - amount);
				setBalance(0);
			}else {
				System.out.println("用户超过可透支额的限额");
				System.out.println("余额为：" + getBalance()+"\n可透支额度为："+this.overdraft);
			}
			
		}
	}

}
