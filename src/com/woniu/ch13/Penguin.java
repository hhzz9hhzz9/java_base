package com.woniu.ch13;

/**
 * ����� --- ����
 * 
 * @author Administrator
 *
 */
public class Penguin extends Pet {

	String sex = "Q��"; // �Ա�

	public Penguin(String name, String sex) {
		// this.setName(name);//Ȩ�����⣬����ֱ�ӷ���
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	 @Override
	public void print() {
		// System.out.println("������԰�:\n�ҵ����ֽ�" + this.getName() + ", ����ֵ��" +
		// this.getHealth() + ", �����˵����ܶ��� " + this.getLove() + ".");
		// super.print();
		System.out.println("�ҵ��Ա���" + this.getSex() + ".");
	}

	@Override
	public void eat() {
		if (this.getHealth() >= 100) {
			System.out.println("���" + this.getName() + "�Ա��ˣ���Ҫιʳ��");
		} else {
			// ����ֵ����3
			this.setHealth(this.getHealth() + 5);
			// ��ʾ��Ϣ
			System.out.println("���" + this.getName() + "�Ա��ˣ�����ֵ����5");
		}

	}

	/**
	 * �����Ӿ����
	 */
	public void swimming() {
		System.out.println("���" + this.getName() + ", ������Ӿ");
		this.setHealth(this.getHealth() - 5);
		this.setLove(this.getLove() + 5);
	}

}
