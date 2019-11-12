package com.woniu.ch13;

/**
 * 主人类
 * 
 * @author Administrator
 *
 */
public class Master {
	
	private String name = ""; // 主人名称
	private int money = 0;// 主人的元宝数

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

//	// 喂食方法 --- 狗
//	public void feed(Dog dog) {
//		dog.eat();
//	}
//
//	// 喂食方法 --- 企鹅
//	public void feed(Penguin penguin) {
//		penguin.eat();
//	}
//
//	// 喂食方法 --- 猫
//	public void feed(Cat cat) {
//		cat.eat();
//	}

	// 改进后的代码 --- 使用多态
	public void feed(Pet pet) {
		pet.eat(); // 多态
	}

	/**
	 *  主人与宠物玩耍的行为
	 * @param pet
	 */
    public void play(Pet pet) { //出入的参数pet
    	//判断pet的真实类型
    	if(pet instanceof Dog) { //进行类型判断  --- 返回true表示类型形同， 如果是Dog
    		Dog dog = (Dog)pet; //可以强转,类型已经确定， --- 下行（向下转型）
    		dog.catchingFlyDisc(); //调用子类特用的方法
    	}else if(pet instanceof Penguin) { //如果是Penguin类型
    		Penguin penguin = (Penguin)pet; //强转为Penguin类型
    		penguin.swimming(); //调用子类特有的方法
    	}
    }
    
    /**
           * 根据编号返回宠物类型 1、2
     */
    public Pet getPet(int typeId) {
    	Pet pet = null;
    	if(typeId == 1) { //返回狗狗
    		pet = new Dog("欧欧", "牧羊犬");
    	}else if(typeId == 2) { //返回企鹅
    		pet = new Penguin("楠楠","Q妹");
    	}
    	return pet;
    }
    
}
