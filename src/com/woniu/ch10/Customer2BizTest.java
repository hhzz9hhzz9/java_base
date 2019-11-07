package com.woniu.ch10;

public class Customer2BizTest {
	public static void main(String[] args) {
		
	Customer2Biz biz = new Customer2Biz();
	Customer2 cust1 = new Customer2();
	Customer2 cust2 = new Customer2();
	cust1.name = "小明";cust1.age = 22;cust1.card = false;//写信息
	cust2.name = "小红";cust2.age = 27;cust2.card = true;
	//添加信息到对象组
	biz.addCustomer(cust1);
	biz.addCustomer(cust2);
	//显示信息
	
	biz.showCustomer();
}
}
