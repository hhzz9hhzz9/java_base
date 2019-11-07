package com.woniu.ch09;

import java.util.Scanner;

public class CustomerBizTest {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 CustomerBiz cust = new CustomerBiz();
		 
		 String answer = "y";
		 do {//名字输入
			 System.out.print("请输入姓名：");
			 String name = sc.next();
			 cust.addName(name);//调用方法储存名字
			 System.out.println("继续吗？");
			 answer = sc.next();
		 }while("y".equals(answer));
		 cust.show();
		 System.out.print("请输入要修改的客户姓名：");
		 String oldName = sc.next();
		 System.out.print("请输入新的客户姓名：");
		 String newName = sc.next();
		 System.out.println("\n修改结果");
		 //执行修改
		 if(cust.editName(oldName, newName)) {
			 System.out.println("修改成功");
		 }else {
			 System.out.println("修改失败");
		 }
		 cust.show();
		 sc.close();
	}

}
