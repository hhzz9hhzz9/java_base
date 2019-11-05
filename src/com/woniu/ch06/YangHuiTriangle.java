package com.woniu.ch06;

import java.util.Scanner;

public class YangHuiTriangle {// 用二维数组打印10行杨辉三角
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入杨辉三角行数：");
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		for (int i = 0; i < num; i++) {//杨辉三角第一列赋值1
			arr[i][0] = 1;
		}
		for (int i = 1; i < arr.length; i++) {//构造包含杨辉三角的二维数组
			for (int j = 1; j < arr.length; j++) {
				arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
		}
		System.out.println("包含"+num+"行杨辉三角的二维数组");		
		for (int i = 0; i < num; i++) {
			for(int n : arr[i]) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {//打印杨辉三角包含的数字并排好版
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
