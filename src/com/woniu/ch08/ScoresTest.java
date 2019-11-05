package com.woniu.ch08;

import java.util.Scanner;

public class ScoresTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scores score = new Scores();
		System.out.print("请输入Java成绩：");				
		score.javaScores = sc.nextInt();
		System.out.print("请输入C#成绩：");
		score.cScores = sc.nextInt();
		System.out.print("请输入db成绩：");
		score.dbScores = sc.nextInt();
		score.showTotal();;
		score.showAvg();
		sc.close();
	}

}
