package com.woniu.ch18.homework;

import java.io.*;
import java.util.regex.Pattern;
/**
 * 作业1
 * @author Administrator
 *
 */
public class Homework1 {
	public static int totalLine(File file) throws IOException {//单个文件行数统计
		Reader r = new FileReader(file);
		BufferedReader br = new BufferedReader(r);
		String str = null;
		int lineNum = 0;
		while ((str = br.readLine()) != null) {
			String reg = ".*[A-Za-z]+.*";
			if (Pattern.matches(reg, str))
				lineNum++;
		}
		r.close();
		br.close();
		return lineNum;
	}	
	public static int sum = 0;//定义全局静态变量用于统计总行数
	public static void test(File file) throws IOException {
		if (file.isFile()) {
			sum += totalLine(file); 			
		} else {
			File[] fs = file.listFiles();
			for (File ff : fs) {
				if(fs!=null && fs.length>0) {//该目录有东西
					test(ff);
				}				 	
			}
		}
	}
	public static void main(String[] args) {
		try {
			test(new File("C:\\workspace_24\\java_base\\src\\com"));
			System.out.println("总行数是："+sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
