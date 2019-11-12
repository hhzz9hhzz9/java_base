package com.woniu.ch13.homework;

public class MyRectangle extends GeometricObject {
	private double width;
	private double height;
	public MyRectangle(String color, double weight, double width, double height) {
		super(color, weight);
		this.width = width;
		this.height = height;
	}
	@Override
	public double findArea() {
		return this.width*this.height;
	}

	public void displayGeometricObject() {
		System.out.println(findArea());
	}

}
