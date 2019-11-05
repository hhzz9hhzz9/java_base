package com.woniu.ch04;

public class Test4 {
	public static void main(String[] args) {
		double temper = 0.0;
		double temperF = 0.0;
		int i= 1;
		do {
			System.out.println(temper +"\t" + temperF);
			temperF = temper*9/5.0 +32;
			temper=temper +20;
            i++;
		}while(i<=10&&temper<=250);
	}

}
