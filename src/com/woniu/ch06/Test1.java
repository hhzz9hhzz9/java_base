package com.woniu.ch06;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] scores = new int[4];
		double sum;
		for (int i = 0; i < 3; i++) {
			sum = 0.0;
			System.out.println("�������" + (i + 1) + "���༶�ĳɼ�");
			for (int j = 0; j < scores.length; j++) {
				System.out.print("�������" + (j + 1) + "λѧ���ĳɼ���");
				scores[j] = sc.nextInt();
				sum += scores[j];
			}
			System.out.println("ƽ���ɼ��ǣ�" + (sum / scores.length));
		}

		sc.close();
	}

}
