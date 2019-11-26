package com.woniu.ch17;

public class MyException extends Exception {
	private String msg;
	public MyException(String msg) {
		super(msg);
	}

}
