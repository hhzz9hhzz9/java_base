package com.woniu.ch12.homework;

public class Cylinder extends Circle{
	private double length = 1;
	public Cylinder() {//无参
		
	}
	public Cylinder(double radius,double length) {//有参
		super(radius);
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double findVolume() {//计算体积
		return super.findArea()*length;
	}

}
