package com.woniu.ch10;

import java.util.Scanner;

public class CharJudgingTest {
	public static void main(String[] args) {
		CharJudging cj = new CharJudging();
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ���ַ�����");
		String inputs = sc.next();
		System.out.print("Ҫ���ҵ��ַ�");
		String word = sc.next();
		int num = cj.counter(inputs, word);
		System.out.println(inputs+"�а���"+num+"��"+word);
		sc.close();
	}
}
