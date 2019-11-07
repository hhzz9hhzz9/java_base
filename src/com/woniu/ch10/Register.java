package com.woniu.ch10;

public class Register {
	
	/**
	 * 验证方法
	 * @param name
	 * @param pwd1
	 * @param pwd2
	 * @return flag
	 */
	public boolean verify(String name, String pwd1, String pwd2) {
		boolean flag = true;
		if (name.length() < 3 || pwd1.length() < 6) {//用户名不小于3，密码不小于6
			System.out.println("用户名密码长度太短");
		} else if (!pwd1.equals(pwd2)) {
			System.out.println("两次密码不同");
		} else {
			System.out.println("注册成功");
			flag = false;
		}
		return flag;
	}
}
