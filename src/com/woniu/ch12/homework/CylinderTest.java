package com.woniu.ch12.homework;

import java.util.Scanner;

public class CylinderTest {
	public static void main(String[] args) {
		double radius,length;
		Scanner sc = new Scanner(System.in);
		Cylinder cyl;
		System.out.print("半径：");
		radius = sc.nextDouble();
		System.out.print("高：");
		length = sc.nextDouble();
		cyl = new Cylinder(radius, length);
		System.out.println("体积为："+cyl.findVolume());
		sc.close();
	}

}
