package com.woniu.ch20;

public class Product123 extends Thread{
	ShareDate2 sd;
	
	/**
	 * @param sd
	 */
	public Product123(ShareDate2 sd) {
		super();
		this.sd = sd;
	}

	@Override
	public void run() {
		for (int i = 0; i < 26; i++) {
			try {
				sd.set123(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
