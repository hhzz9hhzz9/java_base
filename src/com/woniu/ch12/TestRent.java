package com.woniu.ch12;

import java.util.Scanner;

public class TestRent {
	public static void main(String[] args) {
		String no,brand,num,type;			
		int seatCount,days,rent;
		Car car;//����������
		Bus bus;
		Scanner input = new Scanner(System.in);		
		System.out.print("���޵�������");
		days=input.nextInt();	
		System.out.print("������Ҫ���޵��������ͣ�1���γ�      2���ͳ���:");
		num = input.next();		
		if("1".equals(num)){
			System.out.print("������Ҫ���޵�����Ʒ�ƣ�1������    2����ˣ�:");
			brand=input.next();
			System.out.print("������γ����ͺ� ");
			if("1".equals(brand))
				System.out.print("1��550i��");
			else
				System.out.print("2�������GL8  3��������");
			type=input.next();
			no="00000";
			System.out.println("��������������ƺ���:"+no);
			car=new Car(no,brand,type);
			rent=car.calcRent(days);
		}
		else{
			System.out.print("������Ҫ���޵Ŀͳ�Ʒ�ƣ�1���� 2��������:");
			brand=input.next();
			System.out.print("������ͳ�����λ��:");
			seatCount=input.nextInt();
			no="00000";
			System.out.println("��������������ƺ���:"+no);
			bus=new Bus(no,brand,seatCount);
			rent=bus.calcRent(days);
		}		
		System.out.println("\n���޷�����"+rent+"��");
		input.close();
		
	}
		


}
