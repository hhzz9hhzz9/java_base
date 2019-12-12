package com.woniu.ch19;

public class Test01 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
//		MyRunnable mr = new MyRunnable();
//		Thread t = new Thread(mr);
//		t.start();
		for (int i = 100; i < 300; i++) {
			System.out.println("\t"+i);
		}
	}
}
/**
 * ¼Ì³Ð
 * @author Administrator
 *
 */
class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(i);
		}
	}
}
/**
 * ½Ó¿Ú
 * @author Administrator
 *
 */
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(i);
		}
	}
}


