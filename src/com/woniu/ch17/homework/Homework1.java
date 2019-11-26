package com.woniu.ch17.homework;

import java.util.Map;
import java.util.TreeMap;
/**
 * ×÷Òµ1ºÍ2
 */
public class Homework1 {
	static int autoPlus(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		} else {
			return autoPlus(n - 1) + autoPlus(n - 2);
		}
	}
	public static void main(String[] args) {
		Map<String,Integer> map = new TreeMap<>();
		map.put("f(10)", autoPlus(10));
		map.put("f(40)", autoPlus(40));
		map.put("f(30)", autoPlus(30));
		System.out.println(map);
	}
}
