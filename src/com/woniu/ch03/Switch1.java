package com.woniu.ch03;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("²¦°Ö°ÖµÄºÅÂë");
			break;
		case 2:
			System.out.println("²¦ÂèÂèµÄºÅÂë");
			break;
		case 3:
			System.out.println("²¦Ò¯Ò¯µÄºÅÂë");
			break;
		case 4:
			System.out.println("²¦ÄÌÄÌµÄºÅÂë");
			break;
		}
		sc.close();
	}

}
