package com.woniu.ch20;

public class Boy extends Thread{
	Account acc;
	
	/**
	 * @param acc
	 */
	public Boy(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		while(acc.getMoney()>=100) {
			System.out.println("�к�ȡǮ������");
			try {
				acc.setMoney(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("�к�ȡǮ���������Ϊ"+acc.getMoney());
		}
	}
}
