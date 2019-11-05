package com.woniu.ch03;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("小明的成绩：");
		int scorse = sc.nextInt();
		if(scorse >= 60) {
			if (scorse == 100) {
				System.out.println("买车");
			}else if (scorse >= 90) {
				System.out.println("买MP4");
			}else {
				System.out.println("买参考书");
			}
		}else {
			System.out.println("什么都不买");
			sc.close();
		}
	}

}
