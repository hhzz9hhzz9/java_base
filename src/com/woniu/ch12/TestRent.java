package com.woniu.ch12;

import java.util.Scanner;

public class TestRent {
	public static void main(String[] args) {
		String no,brand,num,type;			
		int seatCount,days,rent;
		Car car;//创建对象名
		Bus bus;
		Scanner input = new Scanner(System.in);		
		System.out.print("租赁的天数：");
		days=input.nextInt();	
		System.out.print("请输入要租赁的汽车类型（1：轿车      2、客车）:");
		num = input.next();		
		if("1".equals(num)){
			System.out.print("请输入要租赁的汽车品牌（1、宝马    2、别克）:");
			brand=input.next();
			System.out.print("请输入轿车的型号 ");
			if("1".equals(brand))
				System.out.print("1、550i：");
			else
				System.out.print("2、商务舱GL8  3、林荫大道");
			type=input.next();
			no="00000";
			System.out.println("分配给您的汽车牌号是:"+no);
			car=new Car(no,brand,type);
			rent=car.calcRent(days);
		}
		else{
			System.out.print("请输入要租赁的客车品牌（1、金杯 2、金龙）:");
			brand=input.next();
			System.out.print("请输入客车的座位数:");
			seatCount=input.nextInt();
			no="00000";
			System.out.println("分配给您的汽车牌号是:"+no);
			bus=new Bus(no,brand,seatCount);
			rent=bus.calcRent(days);
		}		
		System.out.println("\n租赁费用是"+rent+"。");
		input.close();
		
	}
		


}
