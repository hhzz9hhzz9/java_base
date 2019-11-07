package com.woniu.ch10.homework;

import java.util.Scanner;

public class ReseverTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®");
		Resever res = new Resever();
		String words = sc.next();
		res.change(words);
		sc.close();
	}

}
