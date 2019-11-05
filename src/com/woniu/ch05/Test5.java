package com.woniu.ch05;

import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) {
		char[] arr1 = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.print("Ô­×Ö·ûÐòÁÐ£º");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\nÉýÐòÅÅÐòºó£º");
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\n½µÐòÅÅÐòºó£º");
		for (int i = arr1.length; i > 0; i--) {
			System.out.print(arr1[i - 1] + " ");
		}

	}
}
