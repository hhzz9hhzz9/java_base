package com.woniu.ch10;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		int[] scores = new int[5];
		System.out.println("输入5人成绩：");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		double avg = stu.callAvg(scores);
		System.out.println("平均分：" + avg);
		int max = stu.callMax(scores);
		System.out.println("最高分：" + max);
		sc.close();

	}

}
