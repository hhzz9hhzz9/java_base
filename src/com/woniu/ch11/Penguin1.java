package com.woniu.ch11;

/**
 * ��������࣬ʹ�þ�̬������
 */
public class Penguin1 {
	String name = "������"; // �ǳ�
	int health = 100; // ����ֵ
	int love = 20; // ���ܶ�
	//static final String SEX_MALE ="Q��";
	//static final String SEX_FEMALE="Q��";
	static final String SEX_MALE = "��";
	static final String SEX_FEMALE = "��";
	String sex = ""; // �Ա�
	/**
	 * ���������Ϣ��
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name 
				+ "������ֵ��" + this.health 	+ "�������˵����ܶ���" 
				+ this.love + "���Ա��� " + this.sex + "��");
	}
}
