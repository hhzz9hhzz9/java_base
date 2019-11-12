package com.woniu.ch13;

/**
 * 企鹅类 --- 子类
 * 
 * @author Administrator
 *
 */
public class Penguin extends Pet {

	String sex = "Q仔"; // 性别

	public Penguin(String name, String sex) {
		// this.setName(name);//权限问题，不能直接访问
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	 @Override
	public void print() {
		// System.out.println("宠物的自白:\n我的名字叫" + this.getName() + ", 健康值是" +
		// this.getHealth() + ", 和主人的亲密度是 " + this.getLove() + ".");
		// super.print();
		System.out.println("我的性别是" + this.getSex() + ".");
	}

	@Override
	public void eat() {
		if (this.getHealth() >= 100) {
			System.out.println("企鹅" + this.getName() + "吃饱了，不要喂食了");
		} else {
			// 健康值增加3
			this.setHealth(this.getHealth() + 5);
			// 提示信息
			System.out.println("企鹅" + this.getName() + "吃饱了，健康值增加5");
		}

	}

	/**
	 * 企鹅游泳方法
	 */
	public void swimming() {
		System.out.println("企鹅" + this.getName() + ", 正在游泳");
		this.setHealth(this.getHealth() - 5);
		this.setLove(this.getLove() + 5);
	}

}
