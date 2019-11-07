package com.woniu.ch10.homework;

import java.util.Scanner;

public class ToUpperTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ToUpper toup = new ToUpper();
		System.out.println("请输入词组：");
		String words = sc.next();
		System.out.println("结果是：");
		toup.change(words);
		sc.close();
	}

}
