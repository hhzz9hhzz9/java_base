package com.bank;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account acc=new Account();
		Scanner input = new Scanner(System.in);
		boolean flag=true;//ѡ���ʶ
		
		while(flag){
			System.out .print("\n1.���  2.ȡ�� 0.�˳�\n��ѡ������Ҫ������ҵ��");
			int choice=input.nextInt();
			if(choice==1){
				System.out .print("���������");
				double savemoney=input.nextDouble();
				acc.save(savemoney);
			}else if(choice==2){
				System.out .print("������ȡ���");
				double depositmoney=input.nextDouble();
				acc.withdraw(depositmoney);
			}else if(choice==0){
				flag=false;
				System.out .print("ллʹ�ã�");
			}
			else{
				System.out .print("ѡ������");
			}		
		}

	}

}