package com.woniu.ch02;

public class Receipt {
	public static void main(String[] args) {
		int shirtPrice = 245;//T���۸�
		int shoePrice = 570;//����Ь�۸�
		int racketPrice = 320;//�����ļ۸�
		int shirtNum = 2;//T������
		int shoeNum = 1;//����Ь����
		int racketNum = 1;//����������
		double discont = 0.8;//�ۿ�
		/*
		 *   ���ѽ�����
		 */
		double finalPay = ((shirtPrice * shirtNum + shoePrice * shoeNum + racketPrice * racketNum) * discont);
		System.out.println("�����ܽ���ǣ�" + finalPay);
		//������Ǯ
		double actualPay = 1500;
		double restMoney = actualPay - finalPay;
		//�������
		int score = (int)finalPay / 100 * 3;
		/*
		 * ��ӡ�嵥
		 */
		System.out.println("��������������*���ѵ�*��������������");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t" + "��" + shirtPrice + "\t" + shirtNum + "\t" + "��" + shirtPrice * shirtNum);
		System.out.println("����Ь\t" + "��" + shoePrice + "\t" + shoeNum + "\t" + "��" + shoePrice * shirtNum);
		System.out.println("������\t" + "��" + racketPrice + "\t" + racketNum + "\t" + "��" + racketPrice * racketNum);
		System.out.println("\t");
		System.out.println("�ۿۣ�" + discont * 10 + "��");
		System.out.println("ʵ�����ѽ�" + "��" + finalPay);
		System.out.println("ʵ�ʽɷѣ�" + "��" + actualPay);
		System.out.println("��Ǯ��" + "��" + restMoney);
		System.out.println("���ι���Ļ���" + score);
	
	}

}
