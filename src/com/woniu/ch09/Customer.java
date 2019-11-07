package com.woniu.ch09;

public class Customer {
	String name;
	String id;
	int call;
	String dizhi;
	public String say() {
		String say = "名字："+name+"\t电话："+call+"\tid："+id+"\t地址："+dizhi;
		return say;
	}

}
