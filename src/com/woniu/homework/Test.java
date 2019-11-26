package com.woniu.homework;

import java.io.File;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("请输入要遍历的目录：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		File f1 = new File(str);
		File[] files = f1.listFiles();
		PrintFiles pf = new PrintFiles();
		pf.printFiles(files);
		sc.close();
	}

}