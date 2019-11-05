package com.woniu.ch05;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入学生的人数：");
		int num = sc.nextInt();
		int max = 0;
		int[] scores = new int[num];
		for (int i = 0; i < scores.length; i++) {// 在数组里存放学生成绩
			System.out.print("请输入第" + (i + 1) + "位学生的成绩：");
			scores[i] = sc.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("\n最高分是" + max);
		System.out.println("学生成绩等级");
		for (int i = 0; i < scores.length; i++) {//取得成绩等级
			if (scores[i] >= (max - 10)) {
				System.out.println("第" + (i + 1) + "位学生的成绩等级为" + 'A');
			} else if (scores[i] >= (max - 20)) {
				System.out.println("第" + (i + 1) + "位学生的成绩等级为" + 'B');
			} else if (scores[i] >= (max - 30)) {
				System.out.println("第" + (i + 1) + "位学生的成绩等级为" + 'C');
			} else {
				System.out.println("第" + (i + 1) + "位学生的成绩等级为" + 'D');
			}
		}
		sc.close();

	}
}
