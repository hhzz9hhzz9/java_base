package com.woniu.ch03;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * String spring = "��"; String summer = "��"; String autumn = "��"; String winter
		 * = "��";
		 */	
		System.out.println("�����·ݣ�");
	    if (sc.hasNextInt()) {
	    	int month = sc.nextInt();
	    	switch (month) {
	    	case 1:
	    		System.out.println("��");
	    		break;
	    	case 2:
	    		System.out.println("��");
	    		break;
	    	case 3:
	    		System.out.println("��");
	    		break;
	    	case 4:
	    		System.out.println("��");
	    		break;
	    	case 5:
	    		System.out.println("��");
	    		break;
	    	case 6:
	    		System.out.println("��");
	    		break;
	    	case 7:
	    		System.out.println("��");
	    		break;
	    	case 8:
	    		System.out.println("��");
	    		break;
	    	case 9:
	    		System.out.println("��");
	    		break;
	    	case 10:
	    		System.out.println("��");
	    		break;
	    	case 11:
	    		System.out.println("��");
	    		break;
	    	case 12:
	    		System.out.println("��");
	    		break;
	    	default :
	    	    System.out.println("�Ƿ�����");
	    	break;	    		
	    	}
	    }else {
	    	System.out.println("�Ƿ�����");
	    }
	    sc.close();
	}

}
