package com.woniu.ch10;

public class Student {
	public double callAvg(int[] scores) {//ƽ����
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = (double) sum / scores.length;
		return avg;
	}

	public int callMax(int[] scores) {//��߷�
		int max = 0;
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}

}
