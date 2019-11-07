package com.woniu.ch10;

public class CharJudging {
	String[] zifu = new String[10];

	public int counter(String inputs, String word) {
		int sum = 0;
		for (int i = 0; i < inputs.length(); i++) {
			zifu[i] = (String) inputs.subSequence(i, i + 1);
		}
		for (int i = 0; i < inputs.length(); i++) {
			if (zifu[i].equals(word)) {
				sum++;
			}
		}
		return sum;
	}

}
