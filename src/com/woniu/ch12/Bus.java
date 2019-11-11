package com.woniu.ch12;

public final class Bus extends MotoVehicle {
	private int saetCount = 0;

	public Bus() {

	}

	public Bus(String no, String brand, int saetCount) {
		super(no, brand);
		this.saetCount = saetCount;
	}

	public int getSaetCount() {
		return saetCount;
	}

	public void setSaetCount(int saetCount) {
		this.saetCount = saetCount;
	}

	public int calcRent(int days) {// º∆À„º€∏Ò
		if (saetCount <= 16) {
			return days * 800;
		} else {
			return days * 1500;
		}
	}

}
