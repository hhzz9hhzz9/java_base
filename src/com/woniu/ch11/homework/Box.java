package com.woniu.ch11.homework;

public class Box {
	public int a = 0,b=0,c=0,v = 0;//长宽高，体积
	public Box() {//无参
		
	}
	public Box(int a,int b,int c) {//有参
		this.a = a;
		this.b = b;
		this.c = c;
		
		
	}
	public void callVolume() {
		v = a*b*c;
		System.out.println("体积是"+v);
	}

}
