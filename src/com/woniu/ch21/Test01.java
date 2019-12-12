package com.woniu.ch21;

public class Test01 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {			
			@Override
			public void run() {
				System.out.println(1+1);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
