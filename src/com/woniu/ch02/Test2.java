package com.woniu.ch02;

import java.util.Scanner;//���� ---��ݼ�ctrl+shift+o

public class Test2 {

	public static void main(String[] args) {
		// 1�����������ܹ��ӿ���̨������Ϣ
		Scanner input = new Scanner(System.in);
		// 2����ʾ������STB�ɼ�
		System.out.print("STB�ĳɼ��ǣ�");
		int stb = input.nextInt();

		// 3����ʾ������java�ɼ�
		System.out.print("Java�ĳɼ��ǣ�");
		int java = input.nextInt();
		

		// 4����ʾ������SQL�ɼ�
		System.out.print("SQL�ĳɼ��ǣ�");
		int sql = input.nextInt();
		input.close();
        // 5���Ʊ�
		System.out.println("------------------");
		System.out.println("STB\tJava\tSQL");
		System.out.println(stb + "\t" + java + "\t" + sql);
		System.out.println("------------------");
		int diffen = java - sql;//��java��SQL�ĳɼ���
		double avg = (stb + java + sql) / 3;//��3�˳ɼ�ƽ��ֵ
		System.out.println("Java��SQL�ĳɼ��" + diffen);
		System.out.println("3�ſε�ƽ�����ǣ�" + avg);

	}
}
