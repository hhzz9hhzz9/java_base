package com.woniu.ch10;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		int[] scores = new int[5];
		System.out.println("����5�˳ɼ���");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		double avg = stu.callAvg(scores);
		System.out.println("ƽ���֣�" + avg);
		int max = stu.callMax(scores);
		System.out.println("��߷֣�" + max);
		sc.close();

	}

}
