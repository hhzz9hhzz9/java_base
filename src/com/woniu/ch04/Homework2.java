package com.woniu.ch04;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,password;
		int i;
		for (i = 0;i<3;i++) {
			System.out.println("�û�����");
			name = sc.next();
			System.out.println("���룺");
			password = sc.next();
			if(!(name.equals("jim")&&password.equals("123456"))) {//�ж��û�������
				System.out.println("��������㻹��"+(2-i)+"�λ���");
				continue;
			}
			else{
				System.out.println("��ӭ��½ϵͳ");
				break;
			}
		}if(i==3) {
			System.out.println("�����������");
		}
		sc.close();
	}

}
