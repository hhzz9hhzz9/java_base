package com.woniu.ch09;

public class Husband {
	String name1 = "С��";
	int age1 = 25;
	
	public void showHus() {
		Wife wife = new Wife();
		System.out.println(name1 + "����" + age1);
		wife.showWife();
	}
}
