package com.woniu.ch06;

import java.util.Scanner;

public class YangHuiTriangle {// �ö�ά�����ӡ10���������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������������������");
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		for (int i = 0; i < num; i++) {//������ǵ�һ�и�ֵ1
			arr[i][0] = 1;
		}
		for (int i = 1; i < arr.length; i++) {//�������������ǵĶ�ά����
			for (int j = 1; j < arr.length; j++) {
				arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
		}
		System.out.println("����"+num+"��������ǵĶ�ά����");		
		for (int i = 0; i < num; i++) {
			for(int n : arr[i]) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {//��ӡ������ǰ��������ֲ��źð�
			for (int j = 0; j < arr.length-i; j++) {
				System.out.print("\t");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print(arr[i][j]+"\t\t");
			}
			System.out.println();
		}

		sc.close();
	}
}
