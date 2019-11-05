package com.woniu.ch02;

public class FinalPay {
	
	public static void main(String[] args) {
		int shirtPrice = 245;//T恤价格
		int shoePrice = 570;//网球鞋价格
		int racketPrice = 320;//网球拍价格
		int shirtNum = 2;//T恤数量
		int shoeNum = 1;//网球鞋数量
		int racketNum = 1;//网球拍数量
		double discont = 0.8;//折扣
		/*
		 *   消费金额计算
		 */
		double finalPay = ((shirtPrice * shirtNum + shoePrice * shoeNum + racketPrice * racketNum) * discont);
		System.out.println("消费总金额是：" + finalPay);
						
	}

}
