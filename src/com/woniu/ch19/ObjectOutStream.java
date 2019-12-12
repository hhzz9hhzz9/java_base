package com.woniu.ch19;

import java.io.*;

public class ObjectOutStream {
	public static void writeObject() throws Exception, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\test\\Person"));
		Person p = new Person("TOm", 18);
		Person p1 = new Person("Tom", 22);
		
		out.writeObject(p);
		out.writeObject(p1);
		out.flush();
		out.close();
	}
	public static void readObject() throws Exception, IOException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\test\\Person"));
		
		Object obj = in.readObject();
		System.out.println(obj);
		in.close();
	}
	public static void main(String[] args) throws Exception {
		writeObject();
		readObject();
	
	}
	

}
