package com.woniu.ch12;

public final class Car extends MotoVehicle{
	private String type ;

	public Car() {
	
	}

	public Car(String no, String brand, String type) {
		super(no, brand);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int calcRent(int days) {
		if(type.equals("1")) {//别克商务舱GL8

			return days*600;
		}else if (type.equals("2")) {//宝马550i

			return days*500;
		}else {//别克林荫大道

			return days*300;
		}
	}


}
