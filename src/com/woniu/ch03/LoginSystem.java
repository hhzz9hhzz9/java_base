package com.woniu.ch03;

import java.util.Scanner;

public class LoginSystem {
	public static void main(String[] args) {
		// һ���˵�
		System.out.println("\n\t\t��ӭʹ���������ع������ϵͳ");
		System.out.println("\n\t\t\t1. ��¼ϵͳ");
		System.out.println("\n\t\t\t2. �˳�");
		System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * ** * * * * * * *");
		Scanner sc = new Scanner(System.in);
		System.out.print("\n��ѡ���������֣�");
		if (sc.hasNextInt()) {
			int num1 = sc.nextInt();
			switch (num1) {
			case 1:// ��¼�˵�
				System.out.println("�������û�����");
				String username = sc.next();
				System.out.println("���������룺");
				String password = sc.next();
				if (username.equals("admin") && password.equals("1234")) {//�ж��û�������
					System.out.println("\n\t\t\t�������ϵͳ");			// ��������˵�
					System.out.println("\n\t\t\t1.�ͻ���Ϣ����");
					System.out.println("\n\t\t\t2.�������");
					System.out.println("\n\t\t\t3.�������");
					System.out.println("\n\t\t\t4.ע��");
					System.out.print("\n��ѡ���������֣�");
					int num2 = sc.nextInt();
					switch (num2) {// ���������˵�
					case 1:
						System.out.println("\n\t\t\t�������ϵ>�ͻ���Ϣϵͳ");
						System.out.println("\n\t\t\t1.��ʾ�ͻ���Ϣ");
						System.out.println("\n\t\t\t2.��ӿͻ���Ϣ");
						System.out.println("\n\t\t\t3.�޸Ŀͻ���Ϣ");
						System.out.println("\n\t\t\t4.��ѯ�ͻ���Ϣ");
						break;
					case 2:
						System.out.println("��");
						break;
					case 3:
						System.out.println("\n\t\t\t�������ϵ>�������");
						System.out.println("\n\t\t\t1.���˴����");
						System.out.println("\n\t\t\t2.���˳齱");
						System.out.println("\n\t\t\t3.�����ʺ�");
						break;
					case 4:
						System.out.println("��");
						break;
					default:
						System.out.println("�������");
						break;
					}
				} else {
					System.out.println("�û���������������");
				}
				break;
			case 2:
				System.out.println("лл����ʹ��");
				break;
			default:
				System.out.println("�������");
				break;
			}
		} else {
			System.out.println("��������ȷ������");
		}

		sc.close();
	}

}
