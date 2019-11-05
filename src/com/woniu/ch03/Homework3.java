package com.woniu.ch03;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * String spring = "春"; String summer = "夏"; String autumn = "秋"; String winter
		 * = "冬";
		 */	
		System.out.println("输入月份：");
	    if (sc.hasNextInt()) {
	    	int month = sc.nextInt();
	    	switch (month) {
	    	case 1:
	    		System.out.println("冬");
	    		break;
	    	case 2:
	    		System.out.println("冬");
	    		break;
	    	case 3:
	    		System.out.println("春");
	    		break;
	    	case 4:
	    		System.out.println("春");
	    		break;
	    	case 5:
	    		System.out.println("春");
	    		break;
	    	case 6:
	    		System.out.println("夏");
	    		break;
	    	case 7:
	    		System.out.println("夏");
	    		break;
	    	case 8:
	    		System.out.println("夏");
	    		break;
	    	case 9:
	    		System.out.println("秋");
	    		break;
	    	case 10:
	    		System.out.println("秋");
	    		break;
	    	case 11:
	    		System.out.println("秋");
	    		break;
	    	case 12:
	    		System.out.println("冬");
	    		break;
	    	default :
	    	    System.out.println("非法参数");
	    	break;	    		
	    	}
	    }else {
	    	System.out.println("非法参数");
	    }
	    sc.close();
	}

}
