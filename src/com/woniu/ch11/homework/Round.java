package com.woniu.ch11.homework;

public class Round {
//	private double r = 0.0, zc = 0.0, mj = 0.0;// �뾶
	double r = 0.0, zc = 0.0, mj = 0.0;
	public Round() {// �޲ι���

	}

	public Round(double r) {// �вι���
		this.r = r;
	}

	public void zhouchang() {
		this.zc = r * 2 * Math.PI;
		System.out.println("Բ���ܳ�Ϊ" + this.zc);
	}
	

//	public double getR() {
//		return r;
//	}
//
//	public void setR(double r) {
//		
//		this.r = r;
//	}

//	public double getZc() {
//		return zc;
//	}
//
//	public void setZc(double zc) {
//		this.zc = zc;
//	}
//
//	public double getMj() {
//		return mj;
//	}
//
//	public void setMj(double mj) {
//		this.mj = mj;
//	}

	public void mianji() {
		this.mj = r * r * Math.PI;
		System.out.println("Բ�������" + this.mj);
	}

}
