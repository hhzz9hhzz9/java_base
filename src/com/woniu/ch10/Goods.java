package com.woniu.ch10;

public class Goods {
	
	public boolean login(String name,String pwd) {
		boolean flag;
		if(name.equals("Tom")&&pwd.equals("123")) {
			flag = false;
			System.out.println("��½�ɹ���");
		}else {
			flag = true;
			System.out.println("��½ʧ��������");
		}
		return flag;
	}

	
	
	
}
