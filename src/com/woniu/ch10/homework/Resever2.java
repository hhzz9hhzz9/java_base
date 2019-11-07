package com.woniu.ch10.homework;

public class Resever2 {
	public void change(String words) {
		char[] str = new char[100];
		str = words.toCharArray();
		int count=0;
		for (int i = 0; i < words.length(); i++) {

//		    str[i] = words.substring(i, i+1);
			if (str[i] >= 'a' && str[i] <= 'z') {
				count++;
			}
		}
		System.out.println("Ð¡Ð´£º"+count);
		System.out.println("´óÐ´£º"+(words.length()-count));
	}
}
