package com.woniu.ch14.homework;

public class InterfaceTest {
	public static void main(String[] args) {
		CompareObject c1 = new ComparableCircle(10);
		CompareObject c2 = new ComparableCircle(9);
		if (c1.compareTo(c2) == 0) {
			System.out.println("���");
		} else if (c1.compareTo(c2) > 0) {
			System.out.println("��һ��Բ��");
		} else {
			System.out.println("��һ��ԲС");
		}

	}

}
