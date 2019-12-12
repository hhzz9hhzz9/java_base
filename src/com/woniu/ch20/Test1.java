package com.woniu.ch20;

class Test01 extends Thread {
	@Override
	public void run() {
		for (int i = 50; i < 100; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\tT1");
		}
	}
}

class Test02 implements Runnable {

	@Override
	public void run() {
		for (int i = 100; i < 150; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\tT2");
		}
	}
}

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		Test01 t1 = new Test01();
		Test02 t2 = new Test02();
		Thread t = new Thread(t2);
		t1.setDaemon(true);
		t.setDaemon(true);
		t1.start();
		t.start();
		for (int i = 0; i < 30; i+=2) {
			Thread.sleep(500);
			System.out.println(i);
		}
		System.out.println("End.");
	}
}
