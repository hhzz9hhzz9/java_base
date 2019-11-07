package com.woniu.ch10.homework;

public class Resever {
	public void change(String words) {
		String[] str = new String[100];
		for (int i =0 ; i <words.length(); i++) {
		    str[i] = words.substring(i, i+1);		    
		}
		for (int i = words.length()-1; i >= 0; i--) {
			System.out.print(str[i]);
		}
	}


}
