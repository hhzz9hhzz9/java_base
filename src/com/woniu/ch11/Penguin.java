package com.woniu.ch11;

/**
 * 企鹅
 * 
 * @author Administrator
 *
 */
public class Penguin {
	 private String name = "无名氏",sex = ""; 
	// 名字
	private int health = 100, love = 0;// 健康值，亲密度
	static final String SEX_MALE = "雄";
	static final String SEX_FEMALE = "雌";
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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
	 * 展示企鹅的信息
	 */
	public void print() {
		
		System.out.println("宠物的自白：\n我的名字叫" + name + "，健康值是" + health + "" + "，和主任的亲密度是" + love + "，性别" + sex);
	}

}