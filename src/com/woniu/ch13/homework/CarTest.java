package com.woniu.ch13.homework;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car("��ɫ","����");
		Car car2 = new Car("��ɫ","����");
		System.out.println("��һ������"+car1.toString());
		System.out.println("�ڶ�������"+car2.toString());
		
		if(car1.equals(car2)) {
			System.out.println("ͬһ����");
		}else {
			System.out.println("��ͬһ����");
		}
	}

}
