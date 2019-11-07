package com.woniu.ch10;

public class Number {
	public boolean verify(String id, String phone1, String phone2) {
		String[] nums = new String[2];
		nums = phone2.split("-");
		boolean flag = true;
		if (!(id.length() == 16 || id.length() == 18)) {
			System.out.println("身份证号必须16位或18位");
			flag = true;
		} else if (phone1.length() != 11) {
			System.out.println("手机号必须11位");
			flag = true;
		} else if (phone2.indexOf("-") == -1 || nums[0].length() != 4 || nums[1].length() != 7) {
			System.out.println("区号必须4位，号码必须7位，用-分开");
			flag = true;
		}else {
			System.out.println("注册成功");
			flag = false;
		}
		return flag;
	}

}
