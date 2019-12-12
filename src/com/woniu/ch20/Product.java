package com.woniu.ch20;

public class Product extends Thread{
	ShareDate sd;

	/**
	 * @param sd
	 */
	public Product(ShareDate sd) {
		this.sd = sd;
	}
	@Override
	public void run() {
		for (char i = 97; i < 121 ; i++) {
			try {
				Thread.sleep((long) (Math.random()*4000));
				sd.setDate(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}
