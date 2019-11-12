package com.woniu.ch13.homework;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car("黄色","奔驰");
		Car car2 = new Car("黄色","奔驰");
		System.out.println("第一辆车："+car1.toString());
		System.out.println("第二辆车："+car2.toString());
		
		if(car1.equals(car2)) {
			System.out.println("同一辆车");
		}else {
			System.out.println("不同一辆车");
		}
	}

}
