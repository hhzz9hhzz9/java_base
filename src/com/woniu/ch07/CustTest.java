package com.woniu.ch07;

public class CustTest {
	public static void main(String[] args) {
		Cust cust = new Cust();
		cust.point = 3050;
		cust.cardType = "金卡";
		cust.show();
		if(cust.point==3050&&cust.cardType.equals("金卡")) {
			System.out.println("回馈500积分");
		}
	}

}
