package com.woniu.ch10;

public class Customer2BizTest {
	public static void main(String[] args) {
		
	Customer2Biz biz = new Customer2Biz();
	Customer2 cust1 = new Customer2();
	Customer2 cust2 = new Customer2();
	cust1.name = "С��";cust1.age = 22;cust1.card = false;//д��Ϣ
	cust2.name = "С��";cust2.age = 27;cust2.card = true;
	//�����Ϣ��������
	biz.addCustomer(cust1);
	biz.addCustomer(cust2);
	//��ʾ��Ϣ
	
	biz.showCustomer();
}
}
