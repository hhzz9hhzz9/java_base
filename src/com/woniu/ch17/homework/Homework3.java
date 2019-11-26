package com.woniu.ch17.homework;

import java.io.*;

/**
 * 作业4
 */
public class Homework3 {
	public static void Delete(File file) throws NullPointerException{
		if(file.isFile()) {
			System.out.println("删除成功"+file.getAbsolutePath());
			file.delete();//删除目录下的文件
		}else {
			//删除子目录中所有文件
			File[] f = file.listFiles();
			for(File ff : f) {
				Delete(ff);
			}
			//删除子目录的目录
			System.out.println("删除成功"+file.getAbsolutePath());
			file.delete();
			
		}
	}
	public static void main(String[] args) {
		try{
			Delete(new File("D:\\test\\student"));
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("目录不存在");
		}finally {
			System.out.println("End.");
		}
	}

}
