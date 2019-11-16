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
		// add(E e) //Object e:���Ԫ��
		coll.add("AA");
		coll.add("BB");
		coll.add(123);
		coll.add(new Date());

		// size() : ��ȡ������Ԫ�صĸ���
		System.out.println(coll);
		System.out.println(coll.size());// 4

		// ��coll2�е�����Ԫ����ӵ�ָ��������
		// addAll(Collection<? extends E> c)
		Collection coll2 = new ArrayList();
		coll2.add(456);
		coll2.add("cc");
		coll.addAll(coll2);
		System.out.println(coll.size());// 6

		// clear() :��ռ����е�Ԫ��
		coll.clear();
		System.out.println(coll);
		System.out.println(coll.size());// 0

		// isEmpty():�жϼ����Ƿ�Ϊ��
		System.out.println(coll.isEmpty());
	}
	@Test
	public void dd() {
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(456);
		coll.add(new String("Tom"));
		coll.add(false);
		Person p = new Person("С��",20);
		coll.add(p);
		
		// 1��contains(Object o) : �жϵ�ǰ�������Ƿ����ָ����Ԫ��,�ж϶�����Ȼ���ö����������equals()����
		 boolean contains = coll.contains(123);
		 System.out.println(contains);
		 boolean contains2 = coll.contains(new String("Tom"));
		// ���p��
		 System.out.println(contains2); // true
		 boolean contains3 = coll.contains(p);
		 System.out.println(contains3); // true
		boolean contains4 = coll.contains(new Person("С��", 20));
		System.out.println(contains4); // false: ���õ��Ǹ��ࣨobject��equals����ʹ����==�Ƚϣ�
		                                // true : ��д�����equals������������ͬ����ͬ

		//2��containsAll(Collection<?> c) :�ж�coll2�����е�����Ԫ���Ƿ���ĳ�������д���
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
		
		//ָ��λ�����Ԫ��
		list.add(0, "bbb");
		System.out.println(list);
		
		//��ȡָ��λ��Ԫ��
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
		
		//��ȡ�������״γ��ֵ�Ԫ�ص�λ��
		int i = list.indexOf("abc");
		System.out.println(i);
	}
}
