package com.woniu.ch12;

public abstract class MotoVehicle {
	private String No = "00000",brand = "��";
//	private int days = 0;
//	double mileage = 0.0;
	public MotoVehicle(String no, String brand) {	//�в�	
		this.brand = brand;
		this.No = no;		
	}
	public MotoVehicle() {//�޲�
		
	}
	public String getNo() {
		return No;
	}
	public String getBrand() {
		return brand;
	}
	public abstract int calcRent(int days);

}
