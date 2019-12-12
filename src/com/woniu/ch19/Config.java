package com.woniu.ch19;

import java.io.*;
import java.util.Properties;

public class Config {
	public static void save() throws Exception{
		Properties pro = new Properties();
		pro.put("url", "https://www.baidu.com/");
		pro.put("name", "Tom");
		pro.put("pw", "123");
		pro.store(new FileOutputStream("myHome.properties"), "tishi");
	}
	public static void read() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.load(new FileInputStream("myHome.properties"));
		String str1 = pro.getProperty("url");
		String str2 = pro.getProperty("name");
		String str3 = pro.getProperty("pw");
	    System.out.println(pro);
	    System.out.println(str1 + str2 + str3);
	}
	public static void main(String[] args) throws Exception {
		save();
		read();
	}

}
