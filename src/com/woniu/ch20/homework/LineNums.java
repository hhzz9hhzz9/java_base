package com.woniu.ch20.homework;

import java.io.*;
import java.util.regex.Pattern;
/**
 * 作业1
 * @author Administrator
 *
 */
public class LineNums {	
	public int totalLine(File file) throws IOException {//单个文件行数统计
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
	private int sum = 0;
	public int test(File file) throws IOException {
		if (file.isFile()) {
			if(file.getName().endsWith(".java")) {
				sum += totalLine(file);
			}						
		} else {
			File[] fs = file.listFiles();
			for (File ff : fs) {
				if(fs!=null && fs.length>0) {//该目录有东西
					test(ff);
				}				 	
			}
		}
		return sum;
	}
}
