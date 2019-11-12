/**
 * 
 */
package com.woniu.ch14;

/**
 * 手机测试
 * 
 * @author Administrator
 *
 */
public class HandsetTest {
	public static void main(String[] args) {
		/**
		 * 智能机
		 */
		AptitudeHandset handset1 = new AptitudeHandset("HTC", "I9001");
		handset1.info();
		handset1.networkConn();
		handset1.play("小时代");
		handset1.takePicture();
		handset1.sendInfo();
		handset1.call();
		System.out.println();
		/**
		 * 普通机
		 */
		CommonHandset handset2 = new CommonHandset("索尼爱立信", "G502c");
		handset2.info();
		handset2.play("热情");
		handset2.sendInfo();
		handset2.call();
	}

}
