package com.woniu.ch10;

import java.util.Scanner;

public class CustomerBizTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CustomerBiz cus = new CustomerBiz();
		
//		String answer = "y";
//		do {
//			System.out.print("������ͻ�����:");
//			String name = input.next();
//			cus.addName(name); //���÷����洢����
//			System.out.println("����������?(y/n)");
//			answer = input.next();
//		}while("y".equals(answer));
		
		
		
//		System.out.println("������Ҫ�޸ĵĿͻ�����");
//		String oldName = input.next();
//		System.out.println("�������µĿͻ�������");
//		String newName = input.next();
//		
//		System.out.println("�޸Ľ��");
//		//ִ���޸�
//		if(cus.editNames(oldName, newName)) {
//			System.out.println("�ҵ����޸ĳɹ���");
//		}
//		cus.showNames();
		
		
		String[] names = {"Tom", "Jack","Merry","Smith","Sunny"};
		
		System.out.println("*** ����ǰ ***  ");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
		
		System.out.println();
		
		System.out.println("*** ����� *** ");
		cus.sortNames(names); //���÷������� --- �����Բ����ļӹ�������ԭʼ������Ӱ��
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
		input.close();
		
		
	}

}
