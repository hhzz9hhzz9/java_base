package com.woniu.ch10;

import java.util.Arrays;

/**
 * �ͻ�������
 * @author Administrator
 *
 */
public class CustomerBiz {

	String[] names = new String[30]; //�ͻ���Ϣ
	
	//��ӿͻ�����
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if(names[i] == null) { //  ==/equals
				names[i] = name;
				break;
			}
		}
	}
	
	//��ʾ�ͻ���Ϣ
	public void showNames() {
		System.out.println("*****************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("*****************************");
		for (int i = 0; i < names.length; i++) {
			if(names[i] != null) {
				System.out.print(names[i] + "\t");
			}
		}
		System.out.println();
	}
	
	//�޸Ŀͻ���Ϣ
	public boolean editNames(String oldName,String newName) {
		boolean find = false; //�Ƿ��޸ĳɹ���־��
		
		//ѭ����ѯ
		for (int i = 0; i < names.length; i++) {
			//��ѯ����ͬ������
			if(names[i] != null && names[i].equals(oldName)) {
				//����
				names[i] = newName;
				find = true;
				break;
			}
		}
		return find;
	}
	
	/**
	 * ����
	 * @param names ����û�����������
	 * @return  ����������
	 */
	public String[] sortNames(String[] names) {
		
		//������
		Arrays.sort(names); 
		
		return names; //��������������
	}

	
}
