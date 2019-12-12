package com.woniu.ch20.homework;

import java.io.*;
import java.util.regex.Pattern;
/**
 * ��ҵ1
 * @author Administrator
 *
 */
public class LineNums {	
	public int totalLine(File file) throws IOException {//�����ļ�����ͳ��
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
				if(fs!=null && fs.length>0) {//��Ŀ¼�ж���
					test(ff);
				}				 	
			}
		}
		return sum;
	}
}
