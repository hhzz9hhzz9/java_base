package com.woniu.ch10;

public class Number {
	public boolean verify(String id, String phone1, String phone2) {
		String[] nums = new String[2];
		nums = phone2.split("-");
		boolean flag = true;
		if (!(id.length() == 16 || id.length() == 18)) {
			System.out.println("���֤�ű���16λ��18λ");
			flag = true;
		} else if (phone1.length() != 11) {
			System.out.println("�ֻ��ű���11λ");
			flag = true;
		} else if (phone2.indexOf("-") == -1 || nums[0].length() != 4 || nums[1].length() != 7) {
			System.out.println("���ű���4λ���������7λ����-�ֿ�");
			flag = true;
		}else {
			System.out.println("ע��ɹ�");
			flag = false;
		}
		return flag;
	}

}
