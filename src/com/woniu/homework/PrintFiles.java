package com.woniu.homework;

import java.io.*;



public class PrintFiles {		
	public void printFiles(File[] files) {
		if(files!=null) {
			for (File file : files) {
				System.out.println(file);
				File[] f2 = file.listFiles();
				printFiles(f2);
 			}
		}
	}

}
