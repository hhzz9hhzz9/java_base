package com.woniu.ch18.homework;

import java.io.*;

/**
 * ��ҵ2
 * 
 * @author Administrator
 *
 */
public class Homework2 {
	public static void myCopy(File s, File t) throws IOException {// ���ļ�����
		OutputStream out = null;
		InputStream in = null;
		try {
			out = new FileOutputStream(t);
			in = new FileInputStream(s);
			byte[] bt = new byte[1024];
			int len = 0;
			while ((len = in.read(bt)) != -1) {
				out.write(bt, 0, len);
			}
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
			if (in != null) {
				in.close();
			}
		}
	}

	public static void copyFiles(File s, File t) throws IOException {
		if (s.isFile()) {
			myCopy(s, t);
		} else {
			File ft = new File(t + File.separator + s.getName());// ����Ҫ���Ƶ��ļ���
			ft.mkdirs();
			if (s.isDirectory()) {
				File[] fs = s.listFiles();
				for (File fss : fs) {// �ж��Ƿ��ļ���
					if (fss.isDirectory()) {
						copyFiles(fss, ft);
					} else {
						File ftt = new File(ft + File.separator + fss.getName());// ����Ҫ���Ƶ��ļ��ĵ�ַ
						myCopy(fss, ftt);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		try {
			copyFiles(new File("D:\\test\\2"), new File("L:"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Success.");
		}
	}

}
