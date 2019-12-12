package com.woniu.ch20.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LineNumsOutput {
	public static void output() throws Exception {
		OutputStream out = new FileOutputStream("D:\\LineNums.txt", true);
		int ln = (new LineNums()).test(new File("C:\\workspace_24"));
		Date date = new Date(); //获取当前的系统时间。
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String time = dateFormat.format(date); //可以把日期转换转指定格式的字符串
		String str = time +"\t"+"代码量："+ ln; 
		str+="\r\n";
		out.write(str.getBytes());
		out.flush();
		out.close();
	}
	public static void main(String[] args) {
		try {
			output();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
