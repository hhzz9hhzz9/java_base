package com.woniu.ch04;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,password;
		int i;
		for (i = 0;i<3;i++) {
			System.out.println("用户名：");
			name = sc.next();
			System.out.println("密码：");
			password = sc.next();
			if(!(name.equals("jim")&&password.equals("123456"))) {//判断用户名密码
				System.out.println("输入错误，你还有"+(2-i)+"次机会");
				continue;
			}
			else{
				System.out.println("欢迎登陆系统");
				break;
			}
		}if(i==3) {
			System.out.println("错误次数过多");
		}
		sc.close();
	}

}
