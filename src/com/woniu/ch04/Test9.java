package com.woniu.ch04;

public class Test9 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i =1;i<=10;i++ ) {
			if (i%2!=0) {
				
				continue;
			}sum=sum+i;System.out.println(i);
		}System.out.println(sum);
	}

}
