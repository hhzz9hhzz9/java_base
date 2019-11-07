package com.woniu.ch10.homework;

import java.util.Scanner;

public class Resever2Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®");
		Resever2 res = new Resever2();
		String words = sc.next();
		res.change(words);
		sc.close();
	}

}
