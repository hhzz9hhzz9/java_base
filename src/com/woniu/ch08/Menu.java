package com.woniu.ch08;

import java.util.Scanner;

public class Menu {

	// ��ʾ��¼�˵�
	public void showLoginMenu() {
		System.out.println("\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t1.��¼ϵͳ\n");
		System.out.println("\t\t2.�˳�\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		System.out.println("��ѡ���������֣�");
		Scanner sc = new Scanner(System.in);
		boolean answer;
		do {
			int num = sc.nextInt();
			switch (num) {
			case 1:
				showMainMenu();
				answer = false;
				break;
			case 2:
				System.out.println("��лʹ��");
				answer = false;
				break;
			default:
				System.out.println("���ִ��������ԣ�");
				answer = true;
				break;
			}
		} while (answer);
		sc.close();
	}

	// ��ʾ���˵�
	public void showMainMenu() {
		System.out.println("\n\t�������ع������ϵͳ���˵�\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		System.out.println("\t\t1.�ͻ���Ϣ����\n");
		System.out.println("\t\t2.�������\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		System.out.println("��ѡ���������ֻ�0������һ�˵���");
		Scanner sc = new Scanner(System.in);
		boolean answer;
		do {
			int num = sc.nextInt();
			switch (num) {
			case 1:
				showCustMenu();
				answer = false;
				break;
			case 2:
				showSendMenu();
				answer = false;
				break;
			case 0:
				showLoginMenu();
				answer = false;
				break;
			default:
				System.out.println("������Ч�����ԣ�");
				answer = true;
				break;
			}
		} while (answer);
		sc.close();
	}

	// ��ʾ�ͻ�����˵�
	public void showCustMenu() {
		System.out.println("\n\t�������ع������ϵͳ >�ͻ�����\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ���������ֻ�0������һ�˵���");
		boolean answer;
		do {
			int num = sc.nextInt();
			switch (num) {
			case 0:
				showMainMenu();
				answer = false;
				break;
			default:
				System.out.println("������Ч�����ԣ�");
				answer = true;
				break;
			}
		} while (answer);
		sc.close();

	}

	// ��ʾ��������˵�
	public void showSendMenu() {
		System.out.println("\n\t�������ع������ϵͳ >�������\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		System.out.println("\t\t1.���˴����\n");
		System.out.println("\t\t2.���˳齱\n");
		System.out.println("\t\t3.�����ʺ�\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		System.out.println("��ѡ���������ֻ�0������һ�˵���");
		Scanner sc = new Scanner(System.in);
		boolean answer;
		do {
			int num = sc.nextInt();
			switch (num) {
			case 0:
				showMainMenu();
				answer = false;
				break;
			default:
				System.out.println("������Ч�����ԣ�");
				answer = true;
				break;
			}
		} while (answer);
		sc.close();
	}

}
