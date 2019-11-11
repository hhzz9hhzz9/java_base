package com.bank;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account acc=new Account();
		Scanner input = new Scanner(System.in);
		boolean flag=true;//选择标识
		
		while(flag){
			System.out .print("\n1.存款  2.取款 0.退出\n请选择你需要办理的业务：");
			int choice=input.nextInt();
			if(choice==1){
				System.out .print("请输入存款金额：");
				double savemoney=input.nextDouble();
				acc.save(savemoney);
			}else if(choice==2){
				System.out .print("请输入取款金额：");
				double depositmoney=input.nextDouble();
				acc.withdraw(depositmoney);
			}else if(choice==0){
				flag=false;
				System.out .print("谢谢使用！");
			}
			else{
				System.out .print("选择有误！");
			}
			input.close();
		}

	}

}
