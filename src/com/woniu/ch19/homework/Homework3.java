package com.woniu.ch19.homework;

class PrimeNumber100000 extends Thread {
	@Override
	public void run() {
		int count1 = 1;
		for (int i = 3; i <= 100000; i+=2) {
			int sum = 0;
				for (int j = 2; j <= i; j++) {
					if (i % j == 0) {
						sum++;
					}
				}
			if (sum == 1)
				count1++;
		}
		System.out.println("2到100000共" + count1 + "个质数");
	}
}

class PrimeNumber200000 extends Thread {
	@Override
	public void run() {
		int count2 = 0;
		for (int i = 99999; i <= 200000; i+=2) {
			int sum = 0;			
				for (int j = 3; j <= i; j++) {
					if (i % j == 0)
						sum++;
				}
			
			if (sum == 1)
				count2++;
		}
		System.out.println("100000到200000共" + count2 + "个质数");
	}
}

public class Homework3 {
	public static void main(String[] args) {
		PrimeNumber100000 p1 = new PrimeNumber100000();
		PrimeNumber200000 p2 = new PrimeNumber200000();
		p2.setPriority(10);
		p1.start();
		p2.start();
	}
}
