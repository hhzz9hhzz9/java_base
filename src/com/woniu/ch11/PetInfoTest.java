package com.woniu.ch11;

import java.util.Scanner;

public class PetInfoTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎来到宠物店：");// 宠物名称
		System.out.print("请输入要领养宠物的姓名：");
		String name = sc.next();// 宠物类型
		System.out.print("请选择要领养宠物的类型(1、狗狗，2、企鹅)");
		int type = sc.nextInt();
		switch (type) {
		case 1: // 如果是狗狗，选择狗狗的类型
			System.out.print("请选择狗的品种(1、聪明的拉布拉多，2、酷酷的雪纳瑞)");
			String strain = "";
			if (sc.nextInt() == 1) {
				strain = "聪明的拉布拉多";
			} else {
				strain = "酷酷的雪纳瑞";
			}
			// 创建dog对象
			Dog dog = new Dog();
			dog.setName(name); 
			dog.setStrain(strain);
//			dog.setHealth(30);
			// 输出狗狗信息
			dog.print();
			break;
		case 2:
			// 如果选择的是企鹅.提示选择企鹅的性别
			System.out.print("请选择企鹅的性别:(1、Q仔，2、Q妹)");
			String sex;
			if (sc.nextInt() == 1) {
				sex = Penguin.SEX_MALE;
			} else {
				sex = Penguin.SEX_FEMALE;
			}
			// 创建企鹅对象
			Penguin penguin = new Penguin();
			penguin.setName(name);
			penguin.setSex(sex);
			// 输出企鹅信息
			penguin.print();
			break;
		default:
			break;
		}
		sc.close();
	}

}
