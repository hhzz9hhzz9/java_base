package com.woniu.ch05;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������4�ҵ�ļ۸�");
		int[] num = new int[4];
		for (int i = 0; i < num.length; i++) {// ���λ�ȡ�۸񣬲������鸳ֵ
			System.out.print("��" + (i + 1) + "�ҵ�ļ۸�");
			num[i] = sc.nextInt();
		}
		int min = num[0];// ����һ���м����������һ����ʼֵ
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {// ���αȽϻ����Сֵ
				min = num[i];
			}
		}
		System.out.println("��ͼ۸��ǣ�" + min);
		sc.close();
	}

}
