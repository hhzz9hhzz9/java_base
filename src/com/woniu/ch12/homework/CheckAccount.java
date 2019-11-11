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
			System.out.println("���Ϊ��" + (getBalance()-amount)+"\n��͸֧���Ϊ��"+this.overdraft);
			setBalance(getBalance()-amount);
		} else {
			if(amount <= getBalance()+ this.overdraft) {
				System.out.println("���Ϊ��" + 0+"\n��͸֧���Ϊ��"+(getBalance()+ this.overdraft - amount));
				setOverdraft(getBalance()+ this.overdraft - amount);
				setBalance(0);
			}else {
				System.out.println("�û�������͸֧����޶�");
				System.out.println("���Ϊ��" + getBalance()+"\n��͸֧���Ϊ��"+this.overdraft);
			}
			
		}
	}

}
