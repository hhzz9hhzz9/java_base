package com.woniu.ch12.homework;

import java.util.Scanner;

public class CylinderTest {
	public static void main(String[] args) {
		double radius,length;
		Scanner sc = new Scanner(System.in);
		Cylinder cyl;
		System.out.print("�뾶��");
		radius = sc.nextDouble();
		System.out.print("�ߣ�");
		length = sc.nextDouble();
		cyl = new Cylinder(radius, length);
		System.out.println("���Ϊ��"+cyl.findVolume());
		sc.close();
	}

}
