package com.woniu.ch03;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("�������Ա����(<4λ����>)��");
		int num = sc.nextInt();
		if (num>=1000 && num<=9999) {

			System.out.print("�������Ա����(��/��<����λ����ʾ>)��");
			String birthday = sc.next();			

			System.out.print("��������֣�");
		    int scores = sc.nextInt();
		    System.out.println();
		    System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println(num + "\t" + birthday + "\t" + scores);
		}else {
			System.out.println("�������");
			sc.close();
		}
		
	}

}
