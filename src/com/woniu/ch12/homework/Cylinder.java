package com.woniu.ch12.homework;

public class Cylinder extends Circle{
	private double length = 1;
	public Cylinder() {//�޲�
		
	}
	public Cylinder(double radius,double length) {//�в�
		super(radius);
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double findVolume() {//�������
		return super.findArea()*length;
	}

}
