package com.woniu.ch06;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数组行数：");
		int n1 = sc.nextInt();
		System.out.print("数组列数：");
		int n2 = sc.nextInt();
		int[][] arr = new int[n1][n2];
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
		int[] newArr = new int[n1];
		int max;
		for (int i = 0; i < arr.length; i++) {
			max = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]>max) {
					newArr[i]=arr[i][j];
				}				
			}
		}
		System.out.println("每行最大值的一维数组；");
		for(int n : newArr) {
			System.out.print(n + "\t");
		}
		sc.close();
	}

}
