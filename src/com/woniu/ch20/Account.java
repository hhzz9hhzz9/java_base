package com.woniu.ch20;

public class Account {
	private int money = 500;

	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 * @throws InterruptedException 
	 */
	public synchronized strictfp final void setMoney(int money) throws InterruptedException {
		if(this.money>=money) {
			System.out.println("ȡǮ...");
			Thread.sleep(500);
			this.money-=money;
		}
	}

	
	

}
