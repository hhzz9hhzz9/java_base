package com.woniu.ch04;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int num1 = rand.nextInt(100);
		int num2;
        int i;
		for (i = 1;; i++) {
			System.out.println("��������");
			num2 = sc.nextInt();
			if (num2 > num1) {
				System.out.println("����");
			} else if (num2 < num1) {
				System.out.println("С��");
			} else {
				System.out.println("���ˣ�һ������" + i + "��");
				break;
			}
		}
		sc.close();
	}

}
