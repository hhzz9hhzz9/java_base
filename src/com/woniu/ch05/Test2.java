package com.woniu.ch05;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = { 8, 4, 2, 1, 23, 344, 12 };
		int i;
		boolean flag = false;
		System.out.println("�������֣�");
		int num = sc.nextInt();
		for (i = 0; i < nums.length; i++) {
			if (num == nums[i]) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("��������");
		} else {
			System.out.println("����������");
		}
		sc.close();
	}

}
