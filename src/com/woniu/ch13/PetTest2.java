package com.woniu.ch13;

import java.util.Scanner;

public class PetTest2 {
	
	public static void main(String[] args) {
		
		//��������
		Master master = new Master("������", 100);
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ���������̵�: ");
		System.out.println("��ѡ����������:(1������ 2�����)");
		int typeId = input.nextInt();
		//����typeId������������
		Pet pet = master.getPet(typeId);
		if(pet != null) {
			System.out.println("�����ɹ�");
			pet.setHealth(80);
			master.feed(pet);//ιʳ --- ��̬
			master.play(pet); //��ˣ --- ����ת��Ϊ����
		}else {
			System.out.println("�Բ���û�д����͵ĳ������ʧ��");
		}
		input.close();
	}

}
