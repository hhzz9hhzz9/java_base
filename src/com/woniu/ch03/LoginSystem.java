package com.woniu.ch03;

import java.util.Scanner;

public class LoginSystem {
	public static void main(String[] args) {
		// 一级菜单
		System.out.println("\n\t\t欢迎使用我行我素购物管理系统");
		System.out.println("\n\t\t\t1. 登录系统");
		System.out.println("\n\t\t\t2. 退出");
		System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * ** * * * * * * *");
		Scanner sc = new Scanner(System.in);
		System.out.print("\n请选择，输入数字：");
		if (sc.hasNextInt()) {
			int num1 = sc.nextInt();
			switch (num1) {
			case 1:// 登录菜单
				System.out.println("请输入用户名：");
				String username = sc.next();
				System.out.println("请输入密码：");
				String password = sc.next();
				if (username.equals("admin") && password.equals("1234")) {//判断用户名密码
					System.out.println("\n\t\t\t购物管理系统");			// 进入二级菜单
					System.out.println("\n\t\t\t1.客户信息管理");
					System.out.println("\n\t\t\t2.购物结算");
					System.out.println("\n\t\t\t3.真情回馈");
					System.out.println("\n\t\t\t4.注销");
					System.out.print("\n请选择，输入数字：");
					int num2 = sc.nextInt();
					switch (num2) {// 进入三级菜单
					case 1:
						System.out.println("\n\t\t\t购物管理系>客户信息系统");
						System.out.println("\n\t\t\t1.显示客户信息");
						System.out.println("\n\t\t\t2.添加客户信息");
						System.out.println("\n\t\t\t3.修改客户信息");
						System.out.println("\n\t\t\t4.查询客户信息");
						break;
					case 2:
						System.out.println("无");
						break;
					case 3:
						System.out.println("\n\t\t\t购物管理系>真情回馈");
						System.out.println("\n\t\t\t1.幸运大放送");
						System.out.println("\n\t\t\t2.幸运抽奖");
						System.out.println("\n\t\t\t3.生日问候");
						break;
					case 4:
						System.out.println("无");
						break;
					default:
						System.out.println("输入错误");
						break;
					}
				} else {
					System.out.println("用户名和密码错误错误");
				}
				break;
			case 2:
				System.out.println("谢谢您的使用");
				break;
			default:
				System.out.println("输入错误");
				break;
			}
		} else {
			System.out.println("请输入正确的数字");
		}

		sc.close();
	}

}
