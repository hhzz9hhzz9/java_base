package com.woniu.ch10;

import java.util.Scanner;

public class CustomerBizTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CustomerBiz cus = new CustomerBiz();
		
//		String answer = "y";
//		do {
//			System.out.print("请输入客户姓名:");
//			String name = input.next();
//			cus.addName(name); //调用方法存储名称
//			System.out.println("继续输入吗?(y/n)");
//			answer = input.next();
//		}while("y".equals(answer));
		
		
		
//		System.out.println("请输入要修改的客户姓名");
//		String oldName = input.next();
//		System.out.println("请输入新的客户姓名：");
//		String newName = input.next();
//		
//		System.out.println("修改结果");
//		//执行修改
//		if(cus.editNames(oldName, newName)) {
//			System.out.println("找到并修改成功！");
//		}
//		cus.showNames();
		
		
		String[] names = {"Tom", "Jack","Merry","Smith","Sunny"};
		
		System.out.println("*** 排序前 ***  ");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
		
		System.out.println();
		
		System.out.println("*** 排序后 *** ");
		cus.sortNames(names); //调用方法排序 --- 方法对参数的加工处理，对原始变量有影响
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
		input.close();
		
		
	}

}
