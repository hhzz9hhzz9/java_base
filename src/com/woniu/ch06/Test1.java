package com.woniu.ch06;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] scores = new int[4];
		double sum;
		for (int i = 0; i < 3; i++) {
			sum = 0.0;
			System.out.println("请输入第" + (i + 1) + "个班级的成绩");
			for (int j = 0; j < scores.length; j++) {
				System.out.print("请输入第" + (j + 1) + "位学生的成绩：");
				scores[j] = sc.nextInt();
				sum += scores[j];
			}
			System.out.println("平均成绩是：" + (sum / scores.length));
		}

		sc.close();
	}

}
