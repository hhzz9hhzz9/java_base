package com.woniu.ch03;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("С���ĳɼ���");
		int scorse = sc.nextInt();
		if(scorse >= 60) {
			if (scorse == 100) {
				System.out.println("��");
			}else if (scorse >= 90) {
				System.out.println("��MP4");
			}else {
				System.out.println("��ο���");
			}
		}else {
			System.out.println("ʲô������");
			sc.close();
		}
	}

}
