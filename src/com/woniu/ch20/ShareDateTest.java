package com.woniu.ch20;

public class ShareDateTest {
	public static void main(String[] args) {
		ShareDate sd = new ShareDate();
		Product p = new Product(sd);
		Custom c = new Custom(sd);
		p.start();
		c.start();
//		ShareDate2 sd = new ShareDate2();
//		Productabc p = new Productabc(sd);
//		Product123 c = new Product123(sd);
//		p.start();
//		c.start();
		
	}

}
