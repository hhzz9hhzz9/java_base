package com.woniu.ch13;

/**
 * 宠物类 狗狗和企鹅的父类
 * @author Administrator
 *
 */
public abstract class Pet {

	private String name = "无名氏"; // 昵称
	private int health = 100; // 健康值
	private int love = 0; // 亲密度
	
   /**
    * 无参构造器
    */
	public Pet() {
//		this.health = 80;
		//System.out.println("执行宠物的无参构造器" + this);
		//System.out.println("Pet -------- " + this);
	}
	
	/**
	 * 有参构造器
	 * @param name
	 */
	public Pet(String name) {
		//System.out.println(this);
		this.name = name;
	}

	/**
	 * 有参构造器
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
	 * 输出Pet的信息
	 */
//	public void print() {
//		System.out.println("宠物的自白:\n我的名字叫" + name + ", 健康值是" + health + ", 和主人的亲密度是 " + love + ".");
//	}
	
    public abstract void print();
    
    //宠物吃饭的行为
    public abstract void eat();
}