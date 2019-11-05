package com.woniu.ch05;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name1 = new String[5];
		System.out.println("请输入商品名称：");
		for (int i = 0; i < name1.length; i++) {
			name1[i] = sc.next();
		}
		System.out.println("商品有");
		for (int i = 0; i < name1.length; i++) {
			System.out.println(name1[i]);
		}

		sc.close();
	}

}
