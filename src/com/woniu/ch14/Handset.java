package com.woniu.ch14;

public abstract class Handset {
	private String brand, type;

	/**
	 * 
	 */
	public Handset() {

	}

	/**
	 * @param brand
	 * @param type
	 */
	public Handset(String brand, String type) {
		super();
		this.brand = brand;
		this.type = type;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	public abstract void sendInfo();// ����Ϣ

	public abstract void call();// ��绰

	public void info() {
		System.out.println("����һ���ͺ�Ϊ" + type + "��" + brand + "�ֻ�:");
	}

}
