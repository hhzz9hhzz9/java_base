package com.woniu.ch08;

import java.util.Scanner;

public class Menu {

	// 显示登录菜单
	public void showLoginMenu() {
		System.out.println("\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t1.登录系统\n");
		System.out.println("\t\t2.退出\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		System.out.println("请选择，输入数字：");
		Scanner sc = new Scanner(System.in);
		boolean answer;
		do {
			int num = sc.nextInt();
			switch (num) {
			case 1:
				showMainMenu();
				answer = false;
				break;
			case 2:
				System.out.println("感谢使用");
				answer = false;
				break;
			default:
				System.out.println("数字错误请重试：");
				answer = true;
				break;
			}
		} while (answer);
		sc.close();
	}

	// 显示主菜单
	public void showMainMenu() {
		System.out.println("\n\t我行我素购物管理系统主菜单\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		System.out.println("\t\t1.客户信息管理\n");
		System.out.println("\t\t2.真情回馈\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		System.out.println("请选择，输入数字或按0返回上一菜单：");
		Scanner sc = new Scanner(System.in);
		boolean answer;
		do {
			int num = sc.nextInt();
			switch (num) {
			case 1:
				showCustMenu();
				answer = false;
				break;
			case 2:
				showSendMenu();
				answer = false;
				break;
			case 0:
				showLoginMenu();
				answer = false;
				break;
			default:
				System.out.println("输入无效请重试：");
				answer = true;
				break;
			}
		} while (answer);
		sc.close();
	}

	// 显示客户管理菜单
	public void showCustMenu() {
		System.out.println("\n\t我行我素购物管理系统 >客户管理\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择，输入数字或按0返回上一菜单：");
		boolean answer;
		do {
			int num = sc.nextInt();
			switch (num) {
			case 0:
				showMainMenu();
				answer = false;
				break;
			default:
				System.out.println("输入无效请重试：");
				answer = true;
				break;
			}
		} while (answer);
		sc.close();

	}

	// 显示真情回馈菜单
	public void showSendMenu() {
		System.out.println("\n\t我行我素购物管理系统 >真情回馈\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		System.out.println("\t\t1.幸运大放送\n");
		System.out.println("\t\t2.幸运抽奖\n");
		System.out.println("\t\t3.生日问候\n");
		System.out.println("* * * * * * * * * * * * * * *\n");
		System.out.println("请选择，输入数字或按0返回上一菜单：");
		Scanner sc = new Scanner(System.in);
		boolean answer;
		do {
			int num = sc.nextInt();
			switch (num) {
			case 0:
				showMainMenu();
				answer = false;
				break;
			default:
				System.out.println("输入无效请重试：");
				answer = true;
				break;
			}
		} while (answer);
		sc.close();
	}

}
