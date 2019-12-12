package com.woniu.ch20;

public class Productabc extends Thread{
	ShareDate2 sd;
	/**
	 * @param sd
	 */
	public Productabc(ShareDate2 sd) {
		super();
		this.sd = sd;
	}
	@Override
	public void run() {
		for (char i = 97; i < 97+26; i++) {
			try {
				sd.setABC(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
