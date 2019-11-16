package com.woniu.ch16.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * 
 * @author Administrator
 *
 */
public class Homework1 {
	@Test
	public void hw1() {
		/**
		 * 作业一
		 */
		Map<String, Integer> a = new HashMap<>();
		Map<String, Integer> b = new HashMap<>();
		a.put("aa", 123);
		a.put("bb", 456);
		a.put("cc", 789);
		a.put("dd", 789);
		b.put("ee", 987);

		System.out.println(a.containsKey("dd"));
		System.out.println(a.containsKey("ee"));
		System.out.println(a.get("cc"));
		a.remove("dd");
		b.putAll(a);
		System.out.println(b.isEmpty());
		b.clear();
		System.out.println(b.size());
		/**
		 * 作业二
		 */
		Set<Entry<String, Integer>> c = a.entrySet();
		Iterator<Entry<String, Integer>> iter = c.iterator();
		while (iter.hasNext()) {
			Entry<String, Integer> d = iter.next();

			System.out.println(d.getKey() + "---" + d.getValue());
		}
		for (Entry<String, Integer> e : c) {
			System.out.println(e.getKey() + "  " + e.getValue());
		}
	}

	@Test
	public void hw3() {
		Map<String, Integer> a = new HashMap<>();
		a.put("Tom", 900);
		a.put("Jack", 800);
		a.put("Hash", 1100);
		a.put("Tree", 1200);
		a.put("Map", 700);

		Set<Entry<String, Integer>> b = a.entrySet();
		System.out.println("姓名\t工资");
		for (Entry<String, Integer> entry : b) {

			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		a.remove("Tom");

		a.put("Jack", a.get("Jack") + 1000);
		System.out.println("Jack的工资：" + a.get("Jack"));
		System.out.println();

//		Set<Entry<String, Integer>> c = a.entrySet();
		Iterator<Entry<String, Integer>> iter2 = a.entrySet().iterator();
		while (iter2.hasNext()) {
			Entry<String, Integer> d = iter2.next();
			if (d.getValue() < 1000) {
				a.put(d.getKey(), (int) (d.getValue() * 1.2));
			} else {
				a.put(d.getKey(), d.getValue());
			}
			System.out.println(d.getKey() + "\t" + d.getValue());
		}
	}

	@Test
	public void hw4() {
		class News {
			private String title, author = "", content = "", date = "";

			public News(String title) {
				this.title = title;
			}

			@Override
			public String toString() {
				return this.title;
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				News other = (News) obj;
				if (title == null) {
					if (other.title != null)
						return false;
				} else if (!title.equals(other.title))
					return false;
				return true;
			}
		}
		News news1 = new News("中国多地遭雾霾笼罩空气质量再成热议话题");
		News news2 = new News("民进党台北举行“火大游行”");
		News news3 = new News("春节临近北京“卖房热”");
		News news4 = new News("春节临近北京“卖房热”");
		System.out.println(news1);
		System.out.println(news2);
		System.out.println(news3);
		System.out.println(news4);
		System.out.println(news1.equals(news2));
		System.out.println(news3.equals(news4));
		HashSet<News> set = new HashSet<News>();
		set.add(news1);
		set.add(news2);
		set.add(news3);
		set.add(news4);
		for (Object obj : set) {
			System.out.println(obj);
		}
		System.out.println(set.size());
	}

	@Test
	public void hw5() {
		Map<String, Integer> m1 = new HashMap<>();
		m1.put("张三", 800);
		m1.put("李四", 1500);
		m1.put("王五", 3000);

		m1.put("张三", 2600);
		Iterator<Entry<String, Integer>> iter = m1.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Integer> m2 = iter.next();
			m1.put(m2.getKey(), m2.getValue() + 100);
		}
		Set<String> a = m1.keySet();
		for (String str : a) {
			System.out.print(str + "\t");
		}
		System.out.println();
		Collection<Integer> b = m1.values();
		for (Integer i : b) {
			System.out.print(i + "\t");
		}
	}

	@Test
	public void hw6() {
		Set<Long> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			long x = (long) (Math.random() * 100 + 100);
			set.add(x);
		}
		List<Long> list = new ArrayList<>(set);
		Collections.sort(list);
		for (Long i : list) {
			System.out.println(i);
		}
	}

}
