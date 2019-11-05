package com.woniu.ch07;

import java.util.Scanner;

public class AdminTest {
	public static void main(String[] args) {
		Administrator admin = new Administrator();
		admin.name = "admin1";
		admin.passWord = "11111";
//		admin.show();
//		Administrator admin2 = new Administrator();
//		admin2.name = "admin2";
//		admin2.passWord = "22222";
//		admin2.show();
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String name = sc.next();
		System.out.print("请输入密码：");
		String password = sc.next();
		if(admin.name.equals(name)&&admin.passWord.equals(password)) {
			System.out.print("请输入新密码：");
			String newPassword = sc.next();
			admin.passWord = newPassword;
			System.out.println("修改成功，新密码是：" + admin.passWord);
		}else {
			System.out.println("用户名和密码错误");
		}
		sc.close();
	}

}
