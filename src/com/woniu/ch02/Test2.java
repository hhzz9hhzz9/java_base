package com.woniu.ch02;

import java.util.Scanner;//导包 ---快捷键ctrl+shift+o

public class Test2 {

	public static void main(String[] args) {
		// 1、创建对象能够从控制台接受信息
		Scanner input = new Scanner(System.in);
		// 2、提示、保存STB成绩
		System.out.print("STB的成绩是：");
		int stb = input.nextInt();

		// 3、提示、保存java成绩
		System.out.print("Java的成绩是：");
		int java = input.nextInt();
		

		// 4、提示、保存SQL成绩
		System.out.print("SQL的成绩是：");
		int sql = input.nextInt();
		input.close();
        // 5、制表
		System.out.println("------------------");
		System.out.println("STB\tJava\tSQL");
		System.out.println(stb + "\t" + java + "\t" + sql);
		System.out.println("------------------");
		int diffen = java - sql;//求java和SQL的成绩差
		double avg = (stb + java + sql) / 3;//求3人成绩平均值
		System.out.println("Java和SQL的成绩差：" + diffen);
		System.out.println("3门课的平均分是：" + avg);

	}
}
