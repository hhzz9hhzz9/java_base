package com.woniu.ch11;
/**
 * ���ﹷ���࣬ʹ��Ȩ�����η�private��public���з�װ��
 * @author
 */
class Dog1 {
	private String name = "������"; // �ǳ�
	private int health = 0; // ����ֵ
	private int love = 0; // ���ܶ�
	private String strain = "��������������Ȯ"; // Ʒ��
	
	public Dog1(){
		
	}
	
	/**
	 * ͨ�����췽��ָ���������ǳơ�Ʒ��
	 * @param name �ǳ�
	 * @param strain Ʒ��
	 */
	public Dog1(String name, String strain) {
		this.name = name;
		this.strain = strain;
	}
	
	/**
	 * ͨ���Է����ӽ���ֵ��
	 */
	public void eat() {
		if (health >= 100) {
			System.out.println("������Ҫ���˶�ѽ��");
		} else {
			health = health + 3;	
			System.out.println("�����Ա����ˣ�");
		}
	}
	/**
	 * ͨ������Ϸ�������������ܶȣ����ٽ���ֵ��
	 */
	public void play() {
		if (health < 60) {
			System.out.println("���������ˣ�");
		} else {
			System.out.println("�������ں�������ˣ��");
			health = health - 10;
			love = love + 5;
		}
	}
	
	/**
	 * ���ù����ǳ�
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ���ù�������ֵ
	 */
	public void setHealth(int health) {
		if(health<0||health>100){
			System.out.println("����ֵӦ����0��100֮�䣬Ĭ��ֵΪ60��");
			this.health=60;
			return;
		}
		this.health = health;
	}
	
	/**
	 * ���ù������ܶ�
	 */
	public void setLove(int love) {
		if(love<0||love>100){
			System.out.println("���ܶ�Ӧ����0��100֮�䣬Ĭ��ֵΪ0��");
			this.love=0;
		}
		this.love = love;
	}
	
	/**
	 * ���ù���Ʒ��
	 */
	public void setStrain(String strain) {
		this.strain = strain;
	}
	/**
	 * ��ȡ�����ǳ�
	 * @return �ǳ�
	 */
	public String getName() {
		return name;
	}	
	/**
	 * ��ȡ��������ֵ
	 * @return ����ֵ
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * ��ȡ�������ܶ�
	 * @return ���ܶ�
	 */
	public int getLove() {
		return love;
	}
	/**
	 * ��ȡ����Ʒ��
	 * @return Ʒ��
	 */
	public String getStrain() {
		return strain;
	}
	/**
	 * �����������Ϣ
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.getName() 
				+ "������ֵ��" + this.getHealth()	+ "�������˵����ܶ���" 
				+ this.getLove() + "������һֻ " + this.getStrain() + "��");
	}
}

