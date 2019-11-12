package com.woniu.ch13.homework;

public class GeometricTest {
	public static void main(String[] args) {
		GeometricObject geo = new Circle("Ô²", 1, 2);
		geo.displayGeometricObject();
		GeometricObject geo2 = new MyRectangle("¾ØÐÎ", 1, 3.14, 4);
		geo2.displayGeometricObject();
		System.out.println(geo.equalsArea(geo2));
	}

}
