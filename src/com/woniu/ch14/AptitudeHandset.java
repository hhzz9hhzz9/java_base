/**
 * 
 */
package com.woniu.ch14;

/**
 * �����ֻ�
 * 
 * @author Administrator
 *
 */
public class AptitudeHandset extends Handset implements Network, PlayWiring, TakePictures {
	public AptitudeHandset() {

	}

	/**
	 * @param brand
	 * @param type
	 */
	public AptitudeHandset(String brand, String type) {
		super(brand, type);

	}

	@Override
	public void play(String content) {
		// TODO ������Ƶ
		System.out.println("��ʼ������Ƶ��" + content + "��......");

	}

	@Override
	public void networkConn() {
		// TODO ����
		System.out.println("�Ѿ������ƶ�����......");

	}

	@Override
	public void sendInfo() {
		// TODO ������Ϣ
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ......");

	}

	@Override
	public void call() {
		// TODO ��Ƶͨ��
		System.out.println("��ʼ��Ƶͨ��......");

	}

	@Override
	public void takePicture() {
		// TODO ����
		System.out.println("����......���ճɹ�");

	}

}
