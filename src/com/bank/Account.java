package com.bank;

public class Account {
	double balance = 0;
	public void withdraw(double money) {
		
		if(money<=balance) {
			balance = balance-money;
			System.out.println("ȡ��ɹ�");
			System.out.println();
			System.out.println("���Ϊ��"+balance);			
		}else {
			System.out.println("ȡ��ʧ��");
			System.out.println();
			System.out.println("���Ϊ��"+balance);
		}

	}
	public void save(double money) {
		balance +=money;
		System.out.println("���ɹ�");
		System.out.println();
		System.out.println("���Ϊ��"+balance);
	}

}
