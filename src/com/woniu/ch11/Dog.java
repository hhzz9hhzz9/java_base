package com.woniu.ch11;

/**
 * 狗狗
 * 
 * @author Administrator
 *
 */
public class Dog {
	private String name = "无名氏", strain = "聪明的拉布拉多犬";
	// 名字
	private int health = 30, love = 0;// 健康值，亲密度

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
			System.out.println("健康值超出范围，默认为40");
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
	 * 展示狗狗的信息
	 */
	public void print() {	
		System.out.println("宠物的自白：\n我的名字叫" + name + "，健康值是" + health + "" + "，和主任的亲密度是" + love + "，我是一只" + strain);
	}

}
