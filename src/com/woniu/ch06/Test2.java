package com.woniu.ch06;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("«Î ‰»Î–– ˝£∫");
		int line = sc.nextInt();
		for (int i = 0;  i< line; i++) {
			for (int j = line; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
