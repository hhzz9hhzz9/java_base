package com.woniu.ch18.homework;

import java.io.*;
import java.util.regex.Pattern;
/**
 * ��ҵ1
 * @author Administrator
 *
 */
public class Homework1 {
	public static int totalLine(File file) throws IOException {//�����ļ�����ͳ��
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
	public static int sum = 0;//����ȫ�־�̬��������ͳ��������
	public static void test(File file) throws IOException {
		if (file.isFile()) {
			sum += totalLine(file); 			
		} else {
			File[] fs = file.listFiles();
			for (File ff : fs) {
				if(fs!=null && fs.length>0) {//��Ŀ¼�ж���
					test(ff);
				}				 	
			}
		}
	}
	public static void main(String[] args) {
		try {
			test(new File("C:\\workspace_24\\java_base\\src\\com"));
			System.out.println("�������ǣ�"+sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
