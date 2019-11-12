package com.woniu.ch13;

import java.util.Scanner;

public class PetTest2 {
	
	public static void main(String[] args) {
		
		//创建主人
		Master master = new Master("王先生", 100);
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到宠物商店: ");
		System.out.println("请选择宠物的类型:(1、狗狗 2、企鹅)");
		int typeId = input.nextInt();
		//根据typeId创建宠物类型
		Pet pet = master.getPet(typeId);
		if(pet != null) {
			System.out.println("领养成功");
			pet.setHealth(80);
			master.feed(pet);//喂食 --- 多态
			master.play(pet); //玩耍 --- 父类转换为子类
		}else {
			System.out.println("对不起，没有此类型的宠物，领养失败");
		}
		input.close();
	}

}
