package com.woniu.ch02;

public class FinalPay {
	
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
						
	}

}
