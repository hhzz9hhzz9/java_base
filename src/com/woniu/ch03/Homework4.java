package com.woniu.ch03;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		if(sc.hasNextInt()) {
			int year = sc.nextInt();
			switch (year%12) {
			case 0:
				System.out.println("����");
				break;
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("����");
				break;
			case 5:
				System.out.println("ţ��");
				break;
			case 6:
				System.out.println("����");
				break;
			case 7:
				System.out.println("����");
				break;
			case 8:
				System.out.println("����");
				break;
			case 9:
				System.out.println("����");
				break;
			case 10:
				System.out.println("����");
				break;
			case 11:
				System.out.println("����");
				break;
			}
		}else {
			System.out.println("�Ƿ�����");
		}
		sc.close();
	}

}