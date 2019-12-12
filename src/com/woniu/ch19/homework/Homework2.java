package com.woniu.ch19.homework;

class Rabbit extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(10);
				if (i == 10)
					Thread.yield();
				if (i == 50)
					Thread.sleep(1);
				if (i == 80)
					Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("兔子跑了" + i + "米");
		}
		System.out.println("兔子到达");
	}
}

class Tortoise extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("乌龟跑了" + i + "米");
		}
		System.out.println("乌龟到达");
	}
}

public class Homework2 {
	public static void main(String[] args) {
		Rabbit r = new Rabbit();
		Tortoise t = new Tortoise();
		r.setPriority(10);
		t.setPriority(1);
		t.start();
		r.start();
	}
}
