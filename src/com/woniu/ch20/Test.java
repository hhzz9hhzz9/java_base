package com.woniu.ch20;

public class Test {

	public static void main(String[] args) {
		Account acc = new Account();
		Boy boy = new Boy(acc);
		Girl girl = new Girl(acc);
		boy.start();
		girl.start();

	}

}
