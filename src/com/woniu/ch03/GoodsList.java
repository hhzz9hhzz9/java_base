package com.woniu.ch03;

import java.util.Scanner;

public class GoodsList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������ѽ�");
		int pay = sc.nextInt();
		System.out.println("�Ƿ�μ��Żݻ�����");
		System.out.println("1����50Ԫ����2Ԫ�������¿���һƿ");
		System.out.println("2����100Ԫ����3Ԫ����500ml");
		System.out.println("3����100Ԫ����10Ԫ����5�������");
		System.out.println("4����200Ԫ����10Ԫ����1���ղ����ղ˹�");
		System.out.println("5����200Ԫ����20Ԫ����ŷ����ˬ��ˮһƿ");
		System.out.println("0��������");
		System.out.print("��ѡ��");
		int num = sc.nextInt();
		switch (num) {
		case 0:
			System.out.println("�������ѽ�" + pay + "\n������");
			break;
		case 1:
			if (pay >= 50) {
				System.out.println("�������ѽ�" + (pay + 2) + "\n���¿���һƿ");
				break;
			} else {
				System.out.println("����");
			}
		case 2:
			if (pay >= 100) {
				System.out.println("�������ѽ�" + (pay + 3) + "\n500ml����һƿ");
				break;
			} else {
				System.out.println("����");
			}
		case 3:
			if (pay >= 100) {
				System.out.println("�������ѽ�" + (pay + 10) + "\n5�������");
				break;
			} else {
				System.out.println("����");
			}
		case 4:
			if (pay >= 200) {
				System.out.println("�������ѽ�" + (pay + 10) + "\n�ղ����ղ˹�");
				break;
			} else {
				System.out.println("����");
			}
		case 5:
			if (pay >= 200) {
				System.out.println("�������ѽ�" + (pay + 20) + "\nŷ����ˬ��ˮ");
				break;
			} else {
				System.out.println("����");
			}
		}
		sc.close();
	}

}
