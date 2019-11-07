package com.woniu.ch10.homework;

public class ToUpper {
	public void change(String words) {
		String[] word = new String[100];
		word = words.split(" ");
		for (int i = 0; i < word.length; i++) {
			if(word[i] != null) {
				word[i] = word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
			System.out.println(word[i]+" ");
			}			
		}
		
	}

}
