package com.woniu.ch11.homework;

import java.util.Scanner;

public class BoxTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a=0,b=0,c= 0;
		System.out.println("依次输入长宽高");
		Box box = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
//		Box box = new Box();

//		box.a = sc.nextInt();

//		box.b = sc.nextInt();

//		box.c = sc.nextInt();
		box.callVolume();
		sc.close();
	}

}
