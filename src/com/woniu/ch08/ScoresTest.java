package com.woniu.ch08;

import java.util.Scanner;

public class ScoresTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scores score = new Scores();
		System.out.print("������Java�ɼ���");				
		score.javaScores = sc.nextInt();
		System.out.print("������C#�ɼ���");
		score.cScores = sc.nextInt();
		System.out.print("������db�ɼ���");
		score.dbScores = sc.nextInt();
		score.showTotal();;
		score.showAvg();
		sc.close();
	}

}
