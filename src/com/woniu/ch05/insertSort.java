package com.woniu.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class insertSort {
	public static void main(String[] args) {
		int[] score = { 98, 85, 82, 63, 60 };

		// 1������
		Arrays.sort(score);

		// 2.�����µ����� --- ��ԭ�����鳤��+1
		int[] newScore = new int[score.length + 1];

		// 3.��������
		for (int i = 0; i < score.length; i++) {
			newScore[i] = score[i];
		}

		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int temp = input.nextInt();

		// 4���ж���ӵ�λ�� ---- �������飬Ѱ�ұ�temp���Ԫ��λ��
		int index = -1;
		for (int i = 0; i < newScore.length; i++) {
			if (newScore[i] >= temp) {
				// ��¼�±�
				index = i;
				break;
			}
		}

		// 5����λ�ô�����Ԫ��
		for (int i = newScore.length - 1; i > index; i--) {
			newScore[i] = newScore[i - 1];
		}

		// 6����temp�����λ��
		newScore[index] = temp;

		System.out.println(Arrays.toString(newScore));
        input.close();
	}

}
