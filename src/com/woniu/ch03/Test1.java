package com.woniu.ch03;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caipiao = sc.nextInt();
		
		if(caipiao == 500) {
			System.out.println("�򳵣����ƣ�����");
		}else {
			System.out.println("����һ�ڣ��ո���");
			sc.close();
		}
	}

}
