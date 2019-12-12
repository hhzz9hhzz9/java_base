package com.woniu.ch19.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 123456789L;
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}		
}

public class Homework1 {
	public static void save() throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\list"));
		List<Person> list = new ArrayList<>();
		list.add(new Person("Tom",18));
		list.add(new Person("Jack",22));
		list.add(new Person("foo",24));
		out.writeObject(list);
		out.flush();
		out.close();
	}
	public static void read() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\list"));
		Object obj = in.readObject();
		System.out.println(obj);
		in.close();
	}
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		save();
		read();
	}

}
