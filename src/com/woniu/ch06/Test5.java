package com.woniu.ch06;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay, num;
		for (int i = 0; i < 3; i++) {
			System.out.println("�������" + (i + 1) + "�����������������Ʒ�۸�");
			num = 0;
			for (int j = 0; j < 3; j++) {

				System.out.print("�������" + (j + 1) + "���۸�");
				pay = sc.nextInt();
				if (pay < 300) {
					continue;
				}
				num++;
				System.out.println("��" + (i + 1) + "���˹���" + num + "����Ʒ�����Żݣ�");
			}
		}
         sc.close();
	}

}
