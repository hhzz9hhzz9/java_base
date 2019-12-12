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
		System.out.println("��ʼ������,����" + data);
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
		System.out.println("������ʼ��,������" + data+"���Կ�ʼ������");
		notify();
		flag = false;

	}

}
