package com.woniu.ch07;

public class CustTest {
	public static void main(String[] args) {
		Cust cust = new Cust();
		cust.point = 3050;
		cust.cardType = "��";
		cust.show();
		if(cust.point==3050&&cust.cardType.equals("��")) {
			System.out.println("����500����");
		}
	}

}
