package com.woniu.ch02;

import java.util.Scanner;

public class LuckyDraw {
	public static void main(String[] args) {
		/*
		 * ��ȡ����
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������4λ��Ա���ţ�");
		int cardNum = sc.nextInt();
		/*
		 * ���㿨�Ÿ���λ�ϵ����֣�������4λ����
		 */
		int gewei = cardNum % 10;
		int shiwei = cardNum / 10 % 10;
		int baiwei = cardNum / 100 % 10;
		int qianwei = cardNum / 1000;
		int sum = gewei + shiwei + baiwei + qianwei;
		boolean luckyMan = (gewei + shiwei + baiwei + qianwei) > 20;//�ж����˿ͻ�
		System.out.println("��Ա����" + cardNum + "��λ��֮�ͣ�" + sum);
		System.out.println("�����˿ͻ���" + luckyMan);
		sc.close();
	}

}
