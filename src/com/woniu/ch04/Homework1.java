package com.woniu.ch04;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("myShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n\n");
		int num1 = 0;//��Ա��	
		int num3 = 0;//��Ա����
		String num2;//��Ա����
		for (int i = 1; i <= 3; i++) {//ѭ��¼���Ա��Ϣ
			System.out.print("��Ա�ţ�");
			num1 = sc.nextInt();
			System.out.print("��Ա���գ�");
			num2 = sc.next();
			System.out.print("��Ա���֣�");
			num3 = sc.nextInt();
			if (num1 < 1000 || num1 > 9999) {
				System.out.println("¼��ʧ��");
				continue;
			}
			System.out.println("���Ļ�Ա��Ϣ�ǣ�");
			System.out.println(num1 + "\t" + num2 + "\t" + num3);
		}
		System.out.println("����");
		sc.close();
	}

}
