package com.woniu.ch05;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ѽ�¼��");
		double[] money = new double[5];
		double sum = 0.0;
		for (int i = 0; i < money.length; i++) {
			System.out.print("��" + (i + 1) + "�ʹ����");
			money[i] = sc.nextDouble();
		}
		System.out.println("\n���\t\t���(Ԫ)");
		for (int i = 0; i < money.length; i++) {
			System.out.println((i + 1) + "\t\t" + money[i]);
			sum += money[i];
		}
		System.out.println("�ܽ��\t\t" + sum);
		sc.close();
	}

}
