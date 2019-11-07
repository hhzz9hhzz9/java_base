package com.woniu.ch08;

import java.util.Scanner;

public class StartSMS {
	Scanner sc = new Scanner(System.in);
	/**
	 * 程序入口
	 */
	public static void main(String[] args) {
		/*初始化系统管理员*/
		Manager manager = new Manager(); 
		boolean con=true;
		do{
		 /*显示登录菜单*/
			Menu menu = new Menu();
			menu.showLoginMenu();
			
			/*实现菜单*/
			Scanner input = new Scanner(System.in);
	        int choice = input.nextInt();
	        switch(choice){
	        	case 1:          
	        		/*密码验证*/
	                System.out.print("请输入用户名：");
	         	   String name = input.next();
	                System.out.print("请输入密码：");
	                String psw = input.next();
	                if(name.equals(manager.passname)&& psw.equals(manager.password)){
	                	System.out.println("@@登录成功："+manager.passname+"@@");
	                	menu.showMainMenu();
	                }else{
	                 	System.out.println("@@您没有权限进入系统，请重新登录。@@");	                 	
	                }
	          	   break;
	        	case 2: 
	        		System.out.println("谢谢您的使用！");
	        		con=false;
	        		break;
	       }input.close();
		}while(con);
		
	}

}
