package com.woniu.ch13;

/**
 * dog ����
 * 
 * @author Administrator
 *
 */
public class Dog extends Pet{
	
	private String strain = "��������������Ȯ";
	
	public Dog() {
	}
	
	public Dog(String name, String strain) {
		super(name); 
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	//@Override
	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.getName() + ", ����ֵ��" + this.getHealth() + ", �����˵����ܶ��� " + this.getLove() + ".");
	    //super.print();
		System.out.println("����һֻ" + this.getStrain() + "Ȯ");
	}

	@Override
	public void eat() {
		if(this.getHealth() >= 100) {
			System.out.println("����" + this.getName() + "�Ա��ˣ���Ҫιʳ��");
		}else {
			//����ֵ����3
			this.setHealth(this.getHealth() + 3);
			//��ʾ��Ϣ
			System.out.println("����" + this.getName() + "�Ա��ˣ�����ֵ����3");
		}
		
	}
	
	/**
	 * dog�ӷ��̵���Ϊ
	 */
	public void catchingFlyDisc() {
		System.out.println("����"  + this.getName() + ", ���ڽӷ���");
		this.setHealth(this.getHealth() - 10);
		this.setLove(this.getLove() + 5);
	}
}
