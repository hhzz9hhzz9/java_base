package com.woniu.ch20;

public class ShareDate2 {
//	private char abc;
//	private int num;
	private boolean flag = true;//true´«Êý×Ö£¬false´«×ÖÄ¸

	/**
	 * @return the date
	 * @throws InterruptedException
	 */
	public synchronized void set123(int num) throws InterruptedException {
		if (!flag) {
			wait();
		}
		flag = false;
		System.out.print(num*2+1);
		System.out.print(num*2+2);
		notify();
	}

	/**
	 * @param date the date to set
	 * @throws InterruptedException
	 */
	public synchronized void setABC(char abc) throws InterruptedException {
		if (flag) {
			wait();
		}
//		this.abc = abc;
		System.out.print(abc);
		notify();
		flag = true;
	}

}
