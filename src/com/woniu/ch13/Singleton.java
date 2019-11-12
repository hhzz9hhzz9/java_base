package com.woniu.ch13;

public class Singleton {
//	private static Singleton singleton;
//	private Singleton() {
//		
//	}
//	public static Singleton getSingleton() {
//		if(singleton == null) {
//			singleton = new Singleton();
//		}
//		return singleton;
//	}
	private static Singleton singleton = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return singleton;
	}

}
