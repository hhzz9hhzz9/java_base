package com.woniu.ch05;

public class Test6 {
	public static void main(String[] args) {
		char[] arr1 = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.print("ԭ�ַ����У�");
		for (int i = 0; i < arr1.length; i++) {// ѭ�����ԭ����
			System.out.print(arr1[i] + " ");
		}
		char temp = 'm';
		int index = 5;
		char[] arr2 = new char[arr1.length + 1];// ����һ�������б���ԭ����
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for (int i = arr2.length - 1; i > index; i--) {// ������λ�ú���ַ�����һλ
			arr2[i] = arr2[i - 1];
		}
		arr2[5] = 'm';// �������ַ�
		System.out.println("\n�������ַ��ǣ�" + temp);
		System.out.println("�����ַ����±��ǣ�" + index);
		System.out.print("�������ַ����У�");// �������������
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
