package com.woniu.ch02;

import java.util.Scanner;

public class JudgingDiscont {
	public static void main(String[] args) {
		/*
		 * ��ȡ�ۿ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ۿۣ�");
		double discont = sc.nextDouble();
		
		int shirtPrice = 245;// T���۸�
		int shoePrice = 570;// ����Ь�۸�
		int racketPrice = 320;// �����ļ۸�
		/*
		 * �ж��ۿ�
		 */
		boolean shirtJudging = (shirtPrice * discont) < 100.0;
		boolean shoeJudging = (shoePrice * discont) < 100.0;
		boolean racketJudging = (racketPrice * discont) < 100.0;
		System.out.println("T���ۿۼ۵���100��" + shirtJudging);
		System.out.println("����Ь�ۿۼ۵���100��" + shoeJudging);
		System.out.println("�������ۿۼ۵���100��" + racketJudging);
		sc.close();
	}
}
