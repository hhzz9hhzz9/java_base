package com.woniu.ch10;

public class Register {
	
	/**
	 * ��֤����
	 * @param name
	 * @param pwd1
	 * @param pwd2
	 * @return flag
	 */
	public boolean verify(String name, String pwd1, String pwd2) {
		boolean flag = true;
		if (name.length() < 3 || pwd1.length() < 6) {//�û�����С��3�����벻С��6
			System.out.println("�û������볤��̫��");
		} else if (!pwd1.equals(pwd2)) {
			System.out.println("�������벻ͬ");
		} else {
			System.out.println("ע��ɹ�");
			flag = false;
		}
		return flag;
	}
}
