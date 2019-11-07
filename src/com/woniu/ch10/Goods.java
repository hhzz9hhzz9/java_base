package com.woniu.ch10;

public class Goods {
	
	public boolean login(String name,String pwd) {
		boolean flag;
		if(name.equals("Tom")&&pwd.equals("123")) {
			flag = false;
			System.out.println("µÇÂ½³É¹¦£¡");
		}else {
			flag = true;
			System.out.println("µÇÂ½Ê§°ÜÇëÖØÊÔ");
		}
		return flag;
	}

	
	
	
}
