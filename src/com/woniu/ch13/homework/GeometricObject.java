package com.woniu.ch13.homework;

public class GeometricObject {
	private String color;
	private double weight;

	public GeometricObject() {// �޲ι���

	}

	public GeometricObject(String color, double weight) { // �вι���
		this.color = color;
		this.weight = weight;
	}

	/**
	 * ���Ե�getter��setter����
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

	public double findArea() {// �����
		return 0;
	}

	public boolean equalsArea(GeometricObject geo) { // �Ƚ�����Ƿ����
		return findArea() == geo.findArea();
	}

	public void displayGeometricObject() {
		System.out.println(findArea());//��ʾ���

	}

}
