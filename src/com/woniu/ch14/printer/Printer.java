package com.woniu.ch14.printer;

/**
 * ��ӡ��
 * @author Administrator
 *
 */
public class Printer {
	
	//���ӿ���Ϊ���ԣ����ǽ����˹�����ϵ
	private InkBox inkBox; //ī��
	private Paper paper; //ֽ��
	
	/**
	 * ���ô�ӡ��ī�� --- ��ī�и�ֵ
	 * @param inkBox
	 */
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	
	/**
	 * ���ô�ӡ��ֽ�� --- ��ֽ�Ÿ�ֵ
	 * @param pager
	 */
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	
	/**
	 * ��ӡ���� ---- ʹ��ֽ�ź�ī�д�ӡ��Ϣ
	 */
	public void print() {
		System.out.println("ʹ��" + inkBox.getColor() + "ī����" + paper.getSize() + "ֽ���ϴ�ӡ");
	}

	
	
	
	

}
