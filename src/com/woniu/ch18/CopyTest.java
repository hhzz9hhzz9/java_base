package com.woniu.ch18;

import java.io.*;
public class CopyTest {
	static void copy(File s,File f) throws IOException {
		OutputStream out = null;
		InputStream in = null;
		
		try {
			out = new FileOutputStream(f);
			in = new FileInputStream(s);
			byte[] bs = new byte[1024];
			int len = 0;
			while((len = in.read(bs)) != -1) {
				out.write(bs,0,len);
			}
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out != null) 
				out.close();
			if(in != null)
			in.close();
		}		
	}
	public static void main(String[] args) throws IOException {
		copy(new File("D:\\LearnJava.java"), new File("D:\\test\\LearnJava.java"));
	}
}
