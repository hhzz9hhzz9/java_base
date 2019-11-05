package com.woniu.ch08;

import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		menu.showLoginMenu();
		sc.close();
	}
}
