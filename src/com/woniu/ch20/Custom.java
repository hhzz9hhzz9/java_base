package com.woniu.ch20;

public class Custom extends Thread{
	ShareDate sd;

	/**
	 * @param sd
	 */
	public Custom(ShareDate sd) {
		this.sd = sd;
	}
	@Override
	public void run() {
		char c = 0;
		do {
			try {
				Thread.sleep((long) (Math.random()*2000));
				c = sd.getDate();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(c<121);
		System.out.println("»¹²»¹»Âï£¡£¡£¡");
	}

}
