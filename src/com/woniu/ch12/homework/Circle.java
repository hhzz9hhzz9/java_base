package com.woniu.ch12.homework;

public class Circle {
	private double radius = 1;

	public Circle() {//�޲�
		
	}

	public Circle(double radius) {//�в�
		
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return radius*radius*3.14;
	}

}
