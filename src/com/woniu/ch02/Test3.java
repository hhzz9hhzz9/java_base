package com.woniu.ch02;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int days = input.nextInt();
		System.out.println("������" + days / 7 );
		System.out.println("������" + days % 7);
		double radius = 1.5;
		double pi = 3.14159;
		double area = pi * radius * radius;
		System.out.println("�����" + area);
		input.close();
				
	}
}
