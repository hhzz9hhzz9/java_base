/**
 * 
 */
package com.woniu.ch14;

/**��ͨ�ֻ�
 * @author Administrator
 *
 */
public class CommonHandset extends Handset implements PlayWiring {
	public CommonHandset(){
		
	}
	

	/**
	 * @param brand
	 * @param type
	 */
	public CommonHandset(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void play(String content) {
		// TODO ������
		System.out.println("��ʼ�������֡�"+content+"��......");

	}

	@Override
	public void sendInfo() {
		// TODO ����Ϣ
		System.out.println("����������Ϣ......");

	}

	@Override
	public void call() {
		// TODO ��绰
		System.out.println("��ʼ����ͨ��.....");

	}

}
