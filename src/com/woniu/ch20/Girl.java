package com.woniu.ch20;

public class Girl extends Thread{
	Account acc;
	
	/**
	 * @param acc
	 */
	public Girl(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		while(acc.getMoney()>=100) {
			System.out.println("Ů��ȡǮ������");
			try {
				acc.setMoney(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Ů��ȡǮ���������Ϊ"+acc.getMoney());
		}
	}
}
