package com.woniu.ch06;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("������(" + i + "," + j + ")����");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("ԭ��ά����");
		for (int i = 0; i < arr.length; i++) {
			for (int n : arr[i]) {
				System.out.print(n + "\t");
			}
			System.out.println("");
		}
		System.out.println("������Ķ�ά����");
		int[][] arr1 = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[3 - i][3 - j] = arr[i][j];
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int n : arr1[i]) {
				System.out.print(n + "\t");
			}
			System.out.println("");
		}
		sc.close();
	}

}
