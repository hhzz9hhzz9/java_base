package com.woniu.ch09;

import java.util.Scanner;

public class CustomerBizTest {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 CustomerBiz cust = new CustomerBiz();
		 
		 String answer = "y";
		 do {//��������
			 System.out.print("������������");
			 String name = sc.next();
			 cust.addName(name);//���÷�����������
			 System.out.println("������");
			 answer = sc.next();
		 }while("y".equals(answer));
		 cust.show();
		 System.out.print("������Ҫ�޸ĵĿͻ�������");
		 String oldName = sc.next();
		 System.out.print("�������µĿͻ�������");
		 String newName = sc.next();
		 System.out.println("\n�޸Ľ��");
		 //ִ���޸�
		 if(cust.editName(oldName, newName)) {
			 System.out.println("�޸ĳɹ�");
		 }else {
			 System.out.println("�޸�ʧ��");
		 }
		 cust.show();
		 sc.close();
	}

}
