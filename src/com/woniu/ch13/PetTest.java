package com.woniu.ch13;

public class PetTest {
	
	public static void main(String[] args) {
		
		//创建对象
//		Dog dog = new Dog("欧欧","雪纳瑞");
//		Penguin penguin = new Penguin("楠楠", "Q仔");
//		Cat cat = new Cat();
//		
//		//健康值
//		dog.setHealth(80);
//		penguin.setHealth(60);
//		cat.setHealth(70);
		
		//创建主人
//		Master master = new Master("王先生", 100);
		
		//喂食 --- 没有使用多态，调用的是不同的feed方法，传递不同的对象
//		master.feed(dog);
//		master.feed(penguin);
//		master.feed(cat);
		
		
		//使用多态 --- 喂食方法，调用相同的feed方法，传递的不同的对象
		Pet pet =  new Dog("欧欧","雪纳瑞"); //将子类对象放入父类变量中，上行
		//Pet pet =  new Penguin("楠楠", "Q仔"); 
		pet.setHealth(80);
		//master.feed(pet); //主人给狗狗喂食
		pet.eat(); //使用相同的方法
	    
//		pet =  new Penguin("楠楠", "Q仔"); //将子类对象放入父类变量中，上行
//		pet.setHealth(80);
//		master.feed(pet); //主人给企鹅喂食
		
	}

}
