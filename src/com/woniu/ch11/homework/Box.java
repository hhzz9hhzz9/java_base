package com.woniu.ch11.homework;

public class Box {
	public int a = 0,b=0,c=0,v = 0;//����ߣ����
	public Box() {//�޲�
		
	}
	public Box(int a,int b,int c) {//�в�
		this.a = a;
		this.b = b;
		this.c = c;
		
		
	}
	public void callVolume() {
		v = a*b*c;
		System.out.println("�����"+v);
	}

}
