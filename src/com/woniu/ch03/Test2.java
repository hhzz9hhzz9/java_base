package com.woniu.ch03;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//����Scanner

		System.out.println("�������ع������ϵͳ> ���˳齱");//��ʾ��Ϣ
		System.out.println("\t");
		
		System.out.print("������4λ��Ա���룺");
		int luckyNum = sc.nextInt();//��ȡ�û�����
		
		int random = (int)(Math.random() * 10);//������������
		int baiwei = luckyNum / 100 % 10;//��ȡ��λ����
		/*
		 * �ж��Ƿ��н���
		 */
		if(baiwei == random) {
			System.out.println(luckyNum + "�������˿ͻ������MP3һ����");
		}else {
			System.out.println(luckyNum + "�ſͻ���лл����֧�֣�");
			sc.close();
		}
		
	}

}
