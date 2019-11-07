package com.woniu.ch10;

import java.util.Arrays;

/**
 * 客户管理类
 * @author Administrator
 *
 */
public class CustomerBiz {

	String[] names = new String[30]; //客户信息
	
	//添加客户姓名
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if(names[i] == null) { //  ==/equals
				names[i] = name;
				break;
			}
		}
	}
	
	//显示客户信息
	public void showNames() {
		System.out.println("*****************************");
		System.out.println("\t客户姓名列表");
		System.out.println("*****************************");
		for (int i = 0; i < names.length; i++) {
			if(names[i] != null) {
				System.out.print(names[i] + "\t");
			}
		}
		System.out.println();
	}
	
	//修改客户信息
	public boolean editNames(String oldName,String newName) {
		boolean find = false; //是否修改成功标志符
		
		//循环查询
		for (int i = 0; i < names.length; i++) {
			//查询到相同的名称
			if(names[i] != null && names[i].equals(oldName)) {
				//更改
				names[i] = newName;
				find = true;
				break;
			}
		}
		return find;
	}
	
	/**
	 * 排序
	 * @param names 传递没有排序的数组
	 * @return  排序后的数组
	 */
	public String[] sortNames(String[] names) {
		
		//排序处理
		Arrays.sort(names); 
		
		return names; //返回排序后的数组
	}

	
}
