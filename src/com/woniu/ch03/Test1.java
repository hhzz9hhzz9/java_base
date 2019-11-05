package com.woniu.ch03;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caipiao = sc.nextInt();
		
		if(caipiao == 500) {
			System.out.println("买车，慈善，旅游");
		}else {
			System.out.println("买下一期，烧高香");
			sc.close();
		}
	}

}
