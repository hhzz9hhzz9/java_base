package com.woniu.ch03;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		/*
		 * �ռ��ͻ����ϺͿͻ���Ϣ
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ƿ��ǻ�Ա����(y)/��(�����ַ�)");
		String answer = sc.next();
		System.out.println("�����빺���");
		double pay = sc.nextDouble();
		double money;
		
		if (answer.equals("y")) {            //�жϻ�Ա�ʸ�
			if (pay >= 200) {                //�жϹ�����
				money = pay * 0.75;
			}else {
				money = pay * 0.8;
			}
		}else {
			if (pay >= 100) {                 //�жϹ�����
				money = pay * 0.9;
			}else {
				money = pay;
			}
		}
		System.out.println("ʵ��֧����" + money);
		sc.close();
	}

}
