/**
 * 
 */
package com.woniu.ch14;

/**
 * �ֻ�����
 * 
 * @author Administrator
 *
 */
public class HandsetTest {
	public static void main(String[] args) {
		/**
		 * ���ܻ�
		 */
		AptitudeHandset handset1 = new AptitudeHandset("HTC", "I9001");
		handset1.info();
		handset1.networkConn();
		handset1.play("Сʱ��");
		handset1.takePicture();
		handset1.sendInfo();
		handset1.call();
		System.out.println();
		/**
		 * ��ͨ��
		 */
		CommonHandset handset2 = new CommonHandset("���ᰮ����", "G502c");
		handset2.info();
		handset2.play("����");
		handset2.sendInfo();
		handset2.call();
	}

}
