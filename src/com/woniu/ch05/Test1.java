package com.woniu.ch05;



public class Test1 {
	public static void main(String[] args) {

		int[] nums = {8,4,2,1,23,344,12};
		int i;
		int sum = 0;

		for(i = 0;i < nums.length;i++) {			
			System.out.println("µÚ"+(i+1)+"Î»"+nums[i]);
			sum+=nums[i];

		}
		System.out.println(sum);


	}
}
