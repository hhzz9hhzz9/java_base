package com.woniu.ch04;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MyShopping�������ϵͳ>�������");
		System.out.println("\n\n****************************");
		System.out.println("1. �ͻ���Ϣ����");
		System.out.println("2. �������");
		System.out.println("3. �������");
		System.out.println("4. ע��");
		System.out.println("******************************\n");
		System.out.println("��ѡ���������֣�");
		int num = sc.nextInt();
		do {
			System.out.println("��ѡ���������֣�");
            num = sc.nextInt();
			System.out.println("�����������֣�");
			num = sc.nextInt();
		} while (num > 4);
		switch (num) {
		case 1:
			System.out.println("1. �ͻ���Ϣ����");
			break;
		case 2:
			System.out.println("2. �������");
			break;
		case 3:
			System.out.println("3. �������");
			break;
		case 4:
			System.out.println("4. ע��");
			break;
		}sc.close();

	}
}
