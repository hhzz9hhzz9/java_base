package com.woniu.ch03;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����������������");
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("�Ƿ�����");

			}
		} else {
			System.out.println("�Ƿ�����");
		}
		sc.close();
	}

}
