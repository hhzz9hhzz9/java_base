package com.woniu.ch11;

/**
 * ���
 * 
 * @author Administrator
 *
 */
public class Penguin {
	 private String name = "������",sex = ""; 
	// ����
	private int health = 100, love = 0;// ����ֵ�����ܶ�
	static final String SEX_MALE = "��";
	static final String SEX_FEMALE = "��";
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	/**
	 * չʾ������Ϣ
	 */
	public void print() {
		
		System.out.println("������԰ף�\n�ҵ����ֽ�" + name + "������ֵ��" + health + "" + "�������ε����ܶ���" + love + "���Ա�" + sex);
	}

}