package com.woniu.ch10.homework;

public class MathLib {
	public StringBuffer jiafa1(String a, String b) {
		StringBuffer str = new StringBuffer(a);
		str = str.append(b);
		return str;
	}
	public double jiafa2(String a, String b) {
		double sum = 0.0;
		sum = Double.valueOf(a) + Double.valueOf(b);
		return sum;
	}
	public double chengfa(String a, String b) {
		double sum = 0.0;
		sum = Double.valueOf(a) * Double.valueOf(b);
		return sum;
	}
	public double jianfa(String a, String b) {
		double sum = 0.0;
		sum = Double.valueOf(a) - Double.valueOf(b);
		return sum;
	}
	public double chufa(String a, String b) {
		double sum = 0.0;
		sum = Double.valueOf(a) / Double.valueOf(b) + Double.valueOf(a) % Double.valueOf(b);
		return sum;
	}
}
