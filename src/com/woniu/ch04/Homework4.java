package com.woniu.ch04;

public class Homework4 {
	public static void main(String[] args) {
		int l = 0;
		int water = 15;
		while (water < 50) {
			water = water + 5;
			l++;
		}
		System.out.println("需要" + l + "次把水缸挑满");
	}

}
