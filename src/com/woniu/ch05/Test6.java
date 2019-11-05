package com.woniu.ch05;

public class Test6 {
	public static void main(String[] args) {
		char[] arr1 = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.print("原字符序列：");
		for (int i = 0; i < arr1.length; i++) {// 循环输出原序列
			System.out.print(arr1[i] + " ");
		}
		char temp = 'm';
		int index = 5;
		char[] arr2 = new char[arr1.length + 1];// 创建一个新序列保存原序列
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for (int i = arr2.length - 1; i > index; i--) {// 将插入位置后的字符后移一位
			arr2[i] = arr2[i - 1];
		}
		arr2[5] = 'm';// 插入新字符
		System.out.println("\n待插入字符是：" + temp);
		System.out.println("插入字符的下标是：" + index);
		System.out.print("插入后的字符序列：");// 输出插入后的序列
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
