package com.woniu.ch03;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		/* �����Ա���� */
		Scanner sc = new Scanner(System.in);
		System.out.print("�������Ա���֣�");
		int scorse = sc.nextInt();
		/* �ж��ۿ� */
		double discont;
		if (scorse < 2000) {
			discont = 0.9;
		}else if (scorse >= 2000 && scorse <4000) {
			discont = 0.8;
		}else if (scorse >= 4000 && scorse <8000) {
			discont = 0.7;
		}else {
			discont = 0.6;
		}
		System.out.println("�û�Ա���ܵ��ۿ��ǣ�" + discont);
		sc.close();
	}

}
