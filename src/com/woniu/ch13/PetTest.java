package com.woniu.ch13;

public class PetTest {
	
	public static void main(String[] args) {
		
		//��������
//		Dog dog = new Dog("ŷŷ","ѩ����");
//		Penguin penguin = new Penguin("��", "Q��");
//		Cat cat = new Cat();
//		
//		//����ֵ
//		dog.setHealth(80);
//		penguin.setHealth(60);
//		cat.setHealth(70);
		
		//��������
//		Master master = new Master("������", 100);
		
		//ιʳ --- û��ʹ�ö�̬�����õ��ǲ�ͬ��feed���������ݲ�ͬ�Ķ���
//		master.feed(dog);
//		master.feed(penguin);
//		master.feed(cat);
		
		
		//ʹ�ö�̬ --- ιʳ������������ͬ��feed���������ݵĲ�ͬ�Ķ���
		Pet pet =  new Dog("ŷŷ","ѩ����"); //�����������븸������У�����
		//Pet pet =  new Penguin("��", "Q��"); 
		pet.setHealth(80);
		//master.feed(pet); //���˸�����ιʳ
		pet.eat(); //ʹ����ͬ�ķ���
	    
//		pet =  new Penguin("��", "Q��"); //�����������븸������У�����
//		pet.setHealth(80);
//		master.feed(pet); //���˸����ιʳ
		
	}

}
