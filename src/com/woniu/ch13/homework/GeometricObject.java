package com.woniu.ch13.homework;

public class GeometricObject {
	private String color;
	private double weight;

	public GeometricObject() {// 无参构造

	}

	public GeometricObject(String color, double weight) { // 有参构造
		this.color = color;
		this.weight = weight;
	}

	/**
	 * 属性的getter和setter方法
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double findArea() {// 求面积
		return 0;
	}

	public boolean equalsArea(GeometricObject geo) { // 比较面积是否相等
		return findArea() == geo.findArea();
	}

	public void displayGeometricObject() {
		System.out.println(findArea());//显示面积

	}

}
