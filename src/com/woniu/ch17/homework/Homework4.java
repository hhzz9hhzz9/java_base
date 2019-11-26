package com.woniu.ch17.homework;

import java.io.*;
/**
 * ื๗าต5
 */

public class Homework4 {
	public static void test1() throws IOException {
		RandomAccessFile raf = null;
		raf = new RandomAccessFile("D:\\test\\test.txt", "rw");
		raf.writeChars("1234");
		if (raf != null)
			raf.close();
	}
	public static void test2() throws IOException {
		RandomAccessFile raf = null;
		raf = new RandomAccessFile("D:\\test\\test.txt", "rw");
		String str = raf.readLine();
		System.out.println(str);
		if (raf != null)
			raf.close();
	}
	public static void test3() throws IOException {
		RandomAccessFile raf = null;
		raf = new RandomAccessFile("D:\\test\\test.txt", "rw");
		String str = null;
		while((str=raf.readLine()) != null) {
			System.out.println(str);
		}
		if (raf != null)
			raf.close();
	}
	public static void main(String[] args) throws IOException {
		test3();
		test2();
		test1();
		
	}

}
