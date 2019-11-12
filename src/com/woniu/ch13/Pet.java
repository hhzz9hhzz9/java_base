package com.woniu.ch13;

/**
 * ������ ���������ĸ���
 * @author Administrator
 *
 */
public abstract class Pet {

	private String name = "������"; // �ǳ�
	private int health = 100; // ����ֵ
	private int love = 0; // ���ܶ�
	
   /**
    * �޲ι�����
    */
	public Pet() {
//		this.health = 80;
		//System.out.println("ִ�г�����޲ι�����" + this);
		//System.out.println("Pet -------- " + this);
	}
	
	/**
	 * �вι�����
	 * @param name
	 */
	public Pet(String name) {
		//System.out.println(this);
		this.name = name;
	}

	/**
	 * �вι�����
	 * @param name
	 * @param health
	 * @param love
	 */
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
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
	 * ���Pet����Ϣ
	 */
//	public void print() {
//		System.out.println("������԰�:\n�ҵ����ֽ�" + name + ", ����ֵ��" + health + ", �����˵����ܶ��� " + love + ".");
//	}
	
    public abstract void print();
    
    //����Է�����Ϊ
    public abstract void eat();
}