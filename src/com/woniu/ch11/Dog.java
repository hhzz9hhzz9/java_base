package com.woniu.ch11;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public class Dog {
	private String name = "������", strain = "��������������Ȯ";
	// ����
	private int health = 30, love = 0;// ����ֵ�����ܶ�

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health>100||health<40) {
			this.health = 40;
			System.out.println("����ֵ������Χ��Ĭ��Ϊ40");
		}else {
			this.health = health;
		}		
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	/**
	 * չʾ��������Ϣ
	 */
	public void print() {	
		System.out.println("������԰ף�\n�ҵ����ֽ�" + name + "������ֵ��" + health + "" + "�������ε����ܶ���" + love + "������һֻ" + strain);
	}

}
