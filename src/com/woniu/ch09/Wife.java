package com.woniu.ch09;

public class Wife {
	String name2 = "С��";
	int age2 = 22;
	

	public void showWife() {  
		Husband hus = new Husband();
		System.out.println(name2 + "����" + age2);
		hus.showHus();
	}
}
