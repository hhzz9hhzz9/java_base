package com.woniu.ch11;



import java.util.Scanner;


/**
 * 领养宠物。
 * @author 
 */
public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		// 1、 输入宠物名称
		System.out.print("请输入要领养宠物的名字：");
		String name = input.next();
		// 2、 选择宠物类型
		System.out.print("请选择要领养的宠物类型：（1、狗狗 2、企鹅）");
		switch (input.nextInt()) {
		case 1:
			// 如果是狗狗,选择狗狗品种
			System.out.print("请选择狗狗的品种:(1、聪明的拉布拉多犬" +
					" 2、酷酷的雪娜瑞)");
			String strain = null;
			if (input.nextInt() == 1) {
				strain = "聪明的拉布拉多犬";
			} else {
				strain = "酷酷的雪娜瑞";
			}
			System.out.print("请输入狗狗的健康值（1~100之间）：");
			int health=input.nextInt();
			// 创建狗狗对象并赋值
			//Dog dog = new Dog();
			Dog1 dog=new Dog1(name, strain);
			dog.setHealth(health);
			// 输出狗狗信息
			dog.print();
			break;
		case 2:
			System.out.print("请选择企鹅的性别：（1、Q仔 2、Q妹）");
			int sex=input.nextInt();
			Penguin1 penguin=new Penguin1();
			penguin.name=name;
			if(sex==1)
				penguin.sex=Penguin.SEX_MALE;
			else
				penguin.sex=Penguin.SEX_FEMALE;
			penguin.print();
		}
		input.close();
	}
}

