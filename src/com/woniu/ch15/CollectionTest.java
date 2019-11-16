package com.woniu.ch15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class CollectionTest {
	class Person{
		String name;int age;

		/**
		 * @param name
		 * @param age
		 */
		public Person(String name, int age) {
			
			this.name = name;
			this.age = age;
		}

//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + getEnclosingInstance().hashCode();
//			result = prime * result + age;
//			result = prime * result + ((name == null) ? 0 : name.hashCode());
//			return result;
//		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (age != other.age)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		private CollectionTest getEnclosingInstance() {
			return CollectionTest.this;
		}
		
		
	}
	@Test
	public void tt() {
		Collection coll = new ArrayList();
		// add(E e) //Object e:添加元素
		coll.add("AA");
		coll.add("BB");
		coll.add(123);
		coll.add(new Date());

		// size() : 获取集合中元素的个数
		System.out.println(coll);
		System.out.println(coll.size());// 4

		// 将coll2中的所有元素添加到指定集合中
		// addAll(Collection<? extends E> c)
		Collection coll2 = new ArrayList();
		coll2.add(456);
		coll2.add("cc");
		coll.addAll(coll2);
		System.out.println(coll.size());// 6

		// clear() :清空集合中的元素
		coll.clear();
		System.out.println(coll);
		System.out.println(coll.size());// 0

		// isEmpty():判断集合是否为空
		System.out.println(coll.isEmpty());
	}
	@Test
	public void dd() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("Tom"));
		coll.add(false);
		Person p = new Person("小王",20);
		coll.add(p);
		
		// 1、contains(Object o) : 判断当前集合中是否包含指定的元素,判断对象相等会调用对象所在类的equals()方法
		 boolean contains = coll.contains(123);
		 System.out.println(contains);
		 boolean contains2 = coll.contains(new String("Tom"));
		// 添加p對
		 System.out.println(contains2); // true
		 boolean contains3 = coll.contains(p);
		 System.out.println(contains3); // true
		boolean contains4 = coll.contains(new Person("小王", 20));
		System.out.println(contains4); // false: 调用的是父类（object的equals方法使用是==比较）
		                                // true : 重写父类的equals方法：属性相同就相同

		//2、containsAll(Collection<?> c) :判断coll2集合中的所有元素是否在某个集合中存在
		Collection coll2 = Arrays.asList(456,123);
		System.out.println(coll.containsAll(coll2));
	}

	@Test
	public void aa() {
		List list = new ArrayList();
		list.add(123);
		list.add(456);
		list.add("abc");
		list.add(123);
		
		System.out.println(list);
		
		//指定位置添加元素
		list.add(0, "bbb");
		System.out.println(list);
		
		//获取指定位置元素
		Object obj = list.get(0);
		System.out.println(obj);

		
	}
	@Test
	void bb() {
		ArrayList list = new ArrayList();
		list.add(123);
		list.add(456);
		list.add("abc");
		list.add(123);
		list.add(new Person("admin", 20));
		
		//获取集合中首次出现的元素的位置
		int i = list.indexOf("abc");
		System.out.println(i);
	}
}
