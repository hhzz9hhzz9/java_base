package com.woniu.ch09;

public class StudentBiz {
	String[] names = new String[30];// ѧ����������

	/**
	 * 
	 * @param name ѧ������
	 */
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {// �ж�ѧ��λ��
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}

	public void show() {
		System.out.println("ѧ��������");
		for (int i = 0; i < names.length; i++) {// �ж�λ���Ƿ�Ϊnull
			if (names[i] != null) {
				System.out.print(names[i] + "\t");
			}
		}
	}

	public boolean searchName(int start, int end, String name) {//Ѱ������
		boolean find = false;
		for (int i = start - 1; i < end; i++) {
			if (names[i].equals(name)) {
				find = true;
				
				break;
			}
		}
		System.out.println();
		return find;

	}

}
