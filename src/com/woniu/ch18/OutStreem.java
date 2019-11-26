package com.woniu.ch18;

import java.io.*;

public class OutStreem {
	public static void test01() throws IOException {
		OutputStream out = new FileOutputStream("D:\\test\\1.txt");
		String str = "hellow";
		byte[] bt = str.getBytes();
		out.write(bt, 0, 3);
		out.flush();
		out.close();
	}

	public static void test02() throws IOException {
		OutputStream out = null;
		try {
			out = new FileOutputStream("D:" + File.separator + "test" + File.separator + "1.txt", true);
			String str = "World";
			out.write(str.getBytes());
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null)
				out.close();
		}
	}

	public static void test03() throws IOException {
		InputStream in = null;
		try {
			in = new FileInputStream("D:" + File.separator + "test" + File.separator + "1.txt");
			
			int i = 0;
			while ((i = in.read()) != -1) {
				
				System.out.println(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				in.close();
			}
		}
	}
	public static void test04() throws IOException {
		InputStream in = null;
		try {
			in = new FileInputStream("D:" + File.separator + "test" + File.separator + "1.txt");
			byte[] bt = new byte[4];
			int i = 0;
			while ((i = in.read(bt)) != -1) {
				String str = new String(bt,0,i);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				in.close();
			}
		}
	}

	public static void main(String[] args) {
		try {
			test04();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Ê§°Ü");
		}
		System.out.println("End.");

	}
}
