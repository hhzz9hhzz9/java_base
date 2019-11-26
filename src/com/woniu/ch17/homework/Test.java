package com.woniu.ch17.homework;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File file = new File("D:\\test\\test.txt");
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
	}
}
