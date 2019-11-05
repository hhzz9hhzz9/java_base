package com.woniu.ch06;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("请输入(" + i + "," + j + ")数据");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("原二维数组");
		for (int i = 0; i < arr.length; i++) {
			for (int n : arr[i]) {
				System.out.print(n + "\t");
			}
			System.out.println("");
		}
		// 首尾两行清零
		for (int i = 0; i < arr[0].length; i++) {
			arr[0][i] = 0;
			arr[(arr.length - 1)][i] = 0;
		}
//		for (int i = 0;i <arr[(arr.length-1)].length;i++) {
//			
//		}
		// 首尾两列清零
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 0;
			arr[i][arr.length] = 0;
		}
		System.out.println("清零后数组");
		for (int i = 0; i < arr.length; i++) {
			for (int n : arr[i]) {
				System.out.print(n + "\t");
			}
			System.out.println("");
		}
		sc.close();
	}

}
