package com.woniu.ch11.homework;

import java.util.Scanner;

public class RoundTest {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("°ë¾¶");
		 Round round = new Round();
//		 Round round = new Round(sc.nextDouble());
//		 round.setR(sc.nextDouble());
		 round.r = sc.nextDouble();
		 round.zhouchang();
		 round.mianji();
		 sc.close();
	}

}
