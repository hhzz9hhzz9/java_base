package com.woniu.ch04;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("MyShopping�������ϵͳ>�������");
		System.out.println("\n\n****************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("******************************");
		Scanner sc = new Scanner(System.in);
		/*
		 * �������
		 */
		double price = 0.0;
		String answer = "y";
		String name = "";
		double discont = 0.8;
		double total = 0.0;
		int num2 = 0;
		/*
		 * ����۸����
		 */
		while (answer.equals("y")) {
			System.out.print("��������Ʒ��ţ�");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				name = "T��";
				price = 245.0;
				break;
			case 2:
				name = "������";
				price = 500.0;
				break;
			case 3:
				name = "����Ь";
				price = 1000.0;
				break;
			}
			System.out.print("��������Ʒ������");
			num2 = sc.nextInt();
			total = total + price*num2;
			System.out.println(name + "��" + price+"\t����"+num2+"\t�ϼ�"+price*num2);
			System.out.print("�Ƿ������y/n��");
			answer = sc.next();
		}
		/*
		 * �������
		 */		
		System.out.println("�ۿۣ�" + discont);
		System.out.println("Ӧ����" + (discont * total));

		System.out.print("ʵ����");
		double payment = sc.nextDouble();

		while (payment - (discont * total) < 0) {
			System.out.print("���㣬���������룺");
			payment = sc.nextDouble();
		}
		System.out.println("���㣺" + (payment - discont * total));
		sc.close();
	}

}
