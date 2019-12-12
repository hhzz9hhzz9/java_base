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
			System.out.println("男孩取钱。。。");
			try {
				acc.setMoney(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("男孩取钱结束，余额为"+acc.getMoney());
		}
	}
}
