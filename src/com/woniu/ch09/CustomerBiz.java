package com.woniu.ch09;

public class CustomerBiz {
	String[] names = new String[30];

	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}

	public void show() {
		System.out.println("******************");
		System.out.println("\t\t客户姓名列表");
		System.out.println("******************");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.print(names[i] + "\t");
			}
		}
		System.out.println();
	}

	public boolean editName(String oldName, String newName) {
		boolean find = false;
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null && names[i].equals(oldName)) {
				names[i] = newName;
				find = true;
				break;
			}
		}
		return find;
	}

}
