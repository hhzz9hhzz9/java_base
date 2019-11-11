package com.woniu.ch12.homework;

public class Circle {
	private double radius = 1;

	public Circle() {//无参
		
	}

	public Circle(double radius) {//有参
		
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
