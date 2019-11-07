package com.woniu.ch10;

import java.util.Scanner;

public class CharJudgingTest {
	public static void main(String[] args) {
		CharJudging cj = new CharJudging();
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String inputs = sc.next();
		System.out.print("要查找的字符");
		String word = sc.next();
		int num = cj.counter(inputs, word);
		System.out.println(inputs+"中包含"+num+"个"+word);
		sc.close();
	}
}
