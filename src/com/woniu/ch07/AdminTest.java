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
		System.out.print("�������û�����");
		String name = sc.next();
		System.out.print("���������룺");
		String password = sc.next();
		if(admin.name.equals(name)&&admin.passWord.equals(password)) {
			System.out.print("�����������룺");
			String newPassword = sc.next();
			admin.passWord = newPassword;
			System.out.println("�޸ĳɹ����������ǣ�" + admin.passWord);
		}else {
			System.out.println("�û������������");
		}
		sc.close();
	}

}
