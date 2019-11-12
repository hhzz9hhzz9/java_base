package com.woniu.ch13;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class Master {
	
	private String name = ""; // ��������
	private int money = 0;// ���˵�Ԫ����

	public Master(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

//	// ιʳ���� --- ��
//	public void feed(Dog dog) {
//		dog.eat();
//	}
//
//	// ιʳ���� --- ���
//	public void feed(Penguin penguin) {
//		penguin.eat();
//	}
//
//	// ιʳ���� --- è
//	public void feed(Cat cat) {
//		cat.eat();
//	}

	// �Ľ���Ĵ��� --- ʹ�ö�̬
	public void feed(Pet pet) {
		pet.eat(); // ��̬
	}

	/**
	 *  �����������ˣ����Ϊ
	 * @param pet
	 */
    public void play(Pet pet) { //����Ĳ���pet
    	//�ж�pet����ʵ����
    	if(pet instanceof Dog) { //���������ж�  --- ����true��ʾ������ͬ�� �����Dog
    		Dog dog = (Dog)pet; //����ǿת,�����Ѿ�ȷ���� --- ���У�����ת�ͣ�
    		dog.catchingFlyDisc(); //�����������õķ���
    	}else if(pet instanceof Penguin) { //�����Penguin����
    		Penguin penguin = (Penguin)pet; //ǿתΪPenguin����
    		penguin.swimming(); //�����������еķ���
    	}
    }
    
    /**
           * ���ݱ�ŷ��س������� 1��2
     */
    public Pet getPet(int typeId) {
    	Pet pet = null;
    	if(typeId == 1) { //���ع���
    		pet = new Dog("ŷŷ", "����Ȯ");
    	}else if(typeId == 2) { //�������
    		pet = new Penguin("��","Q��");
    	}
    	return pet;
    }
    
}
