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
		//���
		map.put("aa", 123);
		map.put("bb", 345);
		map.put("cc", 456);
		map.put("dd", 678);
		//�޸�
		map.put("dd", 567);
		//ɾ��,����value
		Integer i = map.remove("dd");
		System.out.println(i);
		//����key
		Set<String> a = map.keySet();
//		Iterator<String> iter = a.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		for(String str : a ) {
			System.out.print(str+" ");
		}
		System.out.println("\n---------------");
		//����value
		Collection<Integer> b = map.values();
		Iterator<Integer> iter = b.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		//����key---value  entrySet():��ȡ���е�entry
		Set<Entry<String, Integer>> c = map.entrySet();
		Iterator<Entry<String, Integer>> iter2 = c.iterator();
		
		while(iter2.hasNext()) {
			Entry<String, Integer> d = iter2.next();
			 System.out.println(d.getKey()+"--"+d.getValue());
						
		}
		System.out.println();
		System.out.println(map.remove("aa", 123));//ɾ�������ز���ֵ
		Iterator iter3 = c.iterator();
		while(iter3.hasNext()) {
			Object d = iter3.next();
			 System.out.println(((Entry)d).getKey()+"--"+((Entry)d).getValue());						
		}
//		Set keyset = map.keySet();
//		for()
		System.out.println(map.get("bb"));//����keyȡvalue
		System.out.println(map.containsKey("bb"));//�ж��Ƿ����key
		map.containsValue(456);//�ж�value
		
		
	}

}
