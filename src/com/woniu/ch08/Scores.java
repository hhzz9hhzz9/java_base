package com.woniu.ch08;

public class Scores {
	int javaScores,cScores,dbScores;
	public int totalScores() {
		return javaScores+cScores+dbScores;
	}
	public double avg() {
		return totalScores()/3.0;
	}
	public void showTotal() {
		System.out.println("�ܳɼ���"+totalScores());
	}
	public void showAvg() {
		System.out.println("ƽ����:"+avg());
	}

}
