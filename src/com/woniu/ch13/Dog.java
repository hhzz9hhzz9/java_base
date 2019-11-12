package com.woniu.ch13;

/**
 * dog 子类
 * 
 * @author Administrator
 *
 */
public class Dog extends Pet{
	
	private String strain = "聪明的拉布拉多犬";
	
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
		System.out.println("宠物的自白:\n我的名字叫" + this.getName() + ", 健康值是" + this.getHealth() + ", 和主人的亲密度是 " + this.getLove() + ".");
	    //super.print();
		System.out.println("我是一只" + this.getStrain() + "犬");
	}

	@Override
	public void eat() {
		if(this.getHealth() >= 100) {
			System.out.println("狗狗" + this.getName() + "吃饱了，不要喂食了");
		}else {
			//健康值增加3
			this.setHealth(this.getHealth() + 3);
			//提示信息
			System.out.println("狗狗" + this.getName() + "吃饱了，健康值增加3");
		}
		
	}
	
	/**
	 * dog接飞盘的行为
	 */
	public void catchingFlyDisc() {
		System.out.println("狗狗"  + this.getName() + ", 正在接分盘");
		this.setHealth(this.getHealth() - 10);
		this.setLove(this.getLove() + 5);
	}
}
