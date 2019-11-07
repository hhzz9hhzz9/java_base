package com.woniu.ch09;

public class StudentBiz {
	String[] names = new String[30];// 学生姓名组数

	/**
	 * 
	 * @param name 学生名字
	 */
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {// 判断学生位置
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}

	public void show() {
		System.out.println("学生姓名：");
		for (int i = 0; i < names.length; i++) {// 判断位置是否为null
			if (names[i] != null) {
				System.out.print(names[i] + "\t");
			}
		}
	}

	public boolean searchName(int start, int end, String name) {//寻找名字
		boolean find = false;
		for (int i = start - 1; i < end; i++) {
			if (names[i].equals(name)) {
				find = true;
				
				break;
			}
		}
		System.out.println();
		return find;

	}

}
