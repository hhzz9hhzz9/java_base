package com.woniu.ch05;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ѧ����������");
		int num = sc.nextInt();
		int max = 0;
		int[] scores = new int[num];
		for (int i = 0; i < scores.length; i++) {// ����������ѧ���ɼ�
			System.out.print("�������" + (i + 1) + "λѧ���ĳɼ���");
			scores[i] = sc.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("\n��߷���" + max);
		System.out.println("ѧ���ɼ��ȼ�");
		for (int i = 0; i < scores.length; i++) {//ȡ�óɼ��ȼ�
			if (scores[i] >= (max - 10)) {
				System.out.println("��" + (i + 1) + "λѧ���ĳɼ��ȼ�Ϊ" + 'A');
			} else if (scores[i] >= (max - 20)) {
				System.out.println("��" + (i + 1) + "λѧ���ĳɼ��ȼ�Ϊ" + 'B');
			} else if (scores[i] >= (max - 30)) {
				System.out.println("��" + (i + 1) + "λѧ���ĳɼ��ȼ�Ϊ" + 'C');
			} else {
				System.out.println("��" + (i + 1) + "λѧ���ĳɼ��ȼ�Ϊ" + 'D');
			}
		}
		sc.close();

	}
}
