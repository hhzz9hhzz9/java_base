package com.woniu.ch11;



import java.util.Scanner;


/**
 * �������
 * @author 
 */
public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		// 1�� �����������
		System.out.print("������Ҫ������������֣�");
		String name = input.next();
		// 2�� ѡ���������
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������ 2����죩");
		switch (input.nextInt()) {
		case 1:
			// ����ǹ���,ѡ�񹷹�Ʒ��
			System.out.print("��ѡ�񹷹���Ʒ��:(1����������������Ȯ" +
					" 2������ѩ����)");
			String strain = null;
			if (input.nextInt() == 1) {
				strain = "��������������Ȯ";
			} else {
				strain = "����ѩ����";
			}
			System.out.print("�����빷���Ľ���ֵ��1~100֮�䣩��");
			int health=input.nextInt();
			// �����������󲢸�ֵ
			//Dog dog = new Dog();
			Dog1 dog=new Dog1(name, strain);
			dog.setHealth(health);
			// ���������Ϣ
			dog.print();
			break;
		case 2:
			System.out.print("��ѡ�������Ա𣺣�1��Q�� 2��Q�ã�");
			int sex=input.nextInt();
			Penguin1 penguin=new Penguin1();
			penguin.name=name;
			if(sex==1)
				penguin.sex=Penguin.SEX_MALE;
			else
				penguin.sex=Penguin.SEX_FEMALE;
			penguin.print();
		}
		input.close();
	}
}

