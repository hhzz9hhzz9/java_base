package com.woniu.ch16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class MapTest {
	@Test
	public void tt() {
		Map<String,Integer> map = new HashMap<>();
		//添加
		map.put("aa", 123);
		map.put("bb", 345);
		map.put("cc", 456);
		map.put("dd", 678);
		//修改
		map.put("dd", 567);
		//删除,返回value
		Integer i = map.remove("dd");
		System.out.println(i);
		//遍历key
		Set<String> a = map.keySet();
//		Iterator<String> iter = a.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		for(String str : a ) {
			System.out.print(str+" ");
		}
		System.out.println("\n---------------");
		//遍历value
		Collection<Integer> b = map.values();
		Iterator<Integer> iter = b.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		//遍历key---value  entrySet():获取所有的entry
		Set<Entry<String, Integer>> c = map.entrySet();
		Iterator<Entry<String, Integer>> iter2 = c.iterator();
		
		while(iter2.hasNext()) {
			Entry<String, Integer> d = iter2.next();
			 System.out.println(d.getKey()+"--"+d.getValue());
						
		}
		System.out.println();
		System.out.println(map.remove("aa", 123));//删除，返回布尔值
		Iterator iter3 = c.iterator();
		while(iter3.hasNext()) {
			Object d = iter3.next();
			 System.out.println(((Entry)d).getKey()+"--"+((Entry)d).getValue());						
		}
//		Set keyset = map.keySet();
//		for()
		System.out.println(map.get("bb"));//根据key取value
		System.out.println(map.containsKey("bb"));//判断是否存在key
		map.containsValue(456);//判断value
		
		
	}

}
