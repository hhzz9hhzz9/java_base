package com.woniu.ch20;

public class ShareDate {
	private char data;
	private boolean flag = true;

	/**
	 * @return the date
	 * @throws InterruptedException
	 */
	public synchronized char getDate() throws InterruptedException {
		if (flag) {
			wait();
		}
		flag = true;
		System.out.println("开始消费了,拿走" + data);
		System.out.println();
		notify();
		return data;
	}

	/**
	 * @param date the date to set
	 * @throws InterruptedException
	 */
	public synchronized void setDate(char date) throws InterruptedException {
		if (!flag) {
			wait();
		}
		this.data = date;
		System.out.println("生产开始了,生产了" + data+"可以开始消费了");
		notify();
		flag = false;

	}

}
