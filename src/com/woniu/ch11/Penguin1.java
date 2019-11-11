package com.woniu.ch11;

/**
 * 宠物企鹅类，使用静态常量。
 */
public class Penguin1 {
	String name = "无名氏"; // 昵称
	int health = 100; // 健康值
	int love = 20; // 亲密度
	//static final String SEX_MALE ="Q仔";
	//static final String SEX_FEMALE="Q妹";
	static final String SEX_MALE = "雄";
	static final String SEX_FEMALE = "雌";
	String sex = ""; // 性别
	/**
	 * 输出企鹅的信息。
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name 
				+ "，健康值是" + this.health 	+ "，和主人的亲密度是" 
				+ this.love + "，性别是 " + this.sex + "。");
	}
}
