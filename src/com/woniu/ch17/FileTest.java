package com.woniu.ch17;

import java.io.*;

public class FileTest {
	public static void test(File dir,int lev) {
		if (dir.isDirectory()) {// 递归遍历
			File[] ff = dir.listFiles();
			for (File fi : ff) {
				for(int i=1;i<lev;i++) {
					System.out.print("\t");
				}
				System.out.println(fi.getAbsolutePath());
				test(fi,lev+1);
			}
		}
	}
	public static void main(String[] args) {
		File f = new File("D:" + File.separator + "课堂随录");
		test(f,1);
	}
}
