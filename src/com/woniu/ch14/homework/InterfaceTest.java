package com.woniu.ch14.homework;

public class InterfaceTest {
	public static void main(String[] args) {
		CompareObject c1 = new ComparableCircle(10);
		CompareObject c2 = new ComparableCircle(9);
		if (c1.compareTo(c2) == 0) {
			System.out.println("相等");
		} else if (c1.compareTo(c2) > 0) {
			System.out.println("第一个圆大");
		} else {
			System.out.println("第一个圆小");
		}

	}

}
