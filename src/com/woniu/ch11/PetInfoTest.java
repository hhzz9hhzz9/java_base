package com.woniu.ch11;

import java.util.Scanner;

public class PetInfoTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭ��������꣺");// ��������
		System.out.print("������Ҫ���������������");
		String name = sc.next();// ��������
		System.out.print("��ѡ��Ҫ�������������(1��������2�����)");
		int type = sc.nextInt();
		switch (type) {
		case 1: // ����ǹ�����ѡ�񹷹�������
			System.out.print("��ѡ�񹷵�Ʒ��(1���������������࣬2������ѩ����)");
			String strain = "";
			if (sc.nextInt() == 1) {
				strain = "��������������";
			} else {
				strain = "����ѩ����";
			}
			// ����dog����
			Dog dog = new Dog();
			dog.setName(name); 
			dog.setStrain(strain);
//			dog.setHealth(30);
			// ���������Ϣ
			dog.print();
			break;
		case 2:
			// ���ѡ��������.��ʾѡ�������Ա�
			System.out.print("��ѡ�������Ա�:(1��Q�У�2��Q��)");
			String sex;
			if (sc.nextInt() == 1) {
				sex = Penguin.SEX_MALE;
			} else {
				sex = Penguin.SEX_FEMALE;
			}
			// ����������
			Penguin penguin = new Penguin();
			penguin.setName(name);
			penguin.setSex(sex);
			// ��������Ϣ
			penguin.print();
			break;
		default:
			break;
		}
		sc.close();
	}

}
