package com.woniu.ch17;

public class AgeTest {
	public static void test(int age) throws MyException {
		if (age < 0) {
			throw new MyException("年龄不能为负数");
		}
	}

	public static void main(String[] args) {
		int age = -10;
		try {
			test(age);
			System.out.println("年龄为" + age);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("End.");
		}
	}

}
