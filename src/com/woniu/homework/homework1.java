package com.woniu.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇëÊäÈë×Ö·û´®£º");
		String str = sc.next();
		
		char[] words = new char[str.length()];
		words = str.toCharArray();	
		
 		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			Character key = words[i];
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}else {
				map.put(key,1);
			}					
		}
		Set<Entry<Character,Integer>> a = map.entrySet();
		Iterator<Entry<Character, Integer>> iter = a.iterator();
		while(iter.hasNext()) {
			Entry<Character, Integer> b = iter.next();
			System.out.println(b.getKey()+"ÓÐ"+b.getValue()+"¸ö");
		}
//		System.out.println(map);
		sc.close();
	}

}
