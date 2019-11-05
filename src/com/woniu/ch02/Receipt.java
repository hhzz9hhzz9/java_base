package com.woniu.ch02;

public class Receipt {
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
		//计算找钱
		double actualPay = 1500;
		double restMoney = actualPay - finalPay;
		//购物积分
		int score = (int)finalPay / 100 * 3;
		/*
		 * 打印清单
		 */
		System.out.println("＊＊＊＊＊＊＊*消费单*＊＊＊＊＊＊＊");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t" + "￥" + shirtPrice + "\t" + shirtNum + "\t" + "￥" + shirtPrice * shirtNum);
		System.out.println("网球鞋\t" + "￥" + shoePrice + "\t" + shoeNum + "\t" + "￥" + shoePrice * shirtNum);
		System.out.println("网球拍\t" + "￥" + racketPrice + "\t" + racketNum + "\t" + "￥" + racketPrice * racketNum);
		System.out.println("\t");
		System.out.println("折扣：" + discont * 10 + "折");
		System.out.println("实际消费金额：" + "￥" + finalPay);
		System.out.println("实际缴费：" + "￥" + actualPay);
		System.out.println("找钱：" + "￥" + restMoney);
		System.out.println("本次购物的积分" + score);
	
	}

}
