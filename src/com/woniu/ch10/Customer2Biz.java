package com.woniu.ch10;

public class Customer2Biz {
	Customer2[] custs = new Customer2[30];
	public void addCustomer(Customer2 cust) {//�����Ϣ
		for (int i = 0; i < custs.length; i++) {
			if(custs[i] == null) {
				custs[i] = cust;
				break;
			}
		}
	}
	public void showCustomer() {
		System.out.println("�ͻ���Ϣ��");//��ʾ��Ϣ
		for (int i = 0; i < custs.length; i++) {
			if(custs[i] != null) {
				custs[i].show();
			}			
		}
		System.out.println();
	}

}
