package com.woniu.ch17.homework;

import java.io.*;

/**
 * 作业3
 */
public class Homework2 {
	static void IsExist(String str) {
		
		try {
			File file = new File(str);
			if (file.isDirectory()) {
				file.delete();
				System.out.println("删除成功");
			} else {
				file.mkdir();
				System.out.println("创建成功");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("End.");
		}
	}

	public static void main(String[] args) {
		IsExist(null);
	}

}
