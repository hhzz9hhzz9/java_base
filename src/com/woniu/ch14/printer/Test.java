package com.woniu.ch14.printer;

public class Test {

	public static void main(String[] args) {

		// �����ӡ��
		Printer printer = new Printer();
		// ����ֽ��
		Paper paper = null;
		// ����ī��
		InkBox inkBox = null;
//
//		// 1���ڰ�ī��A4ֽ��
//		paper = new A4Paper(); // ʵ�������ӿڣ���̬
//		inkBox = new GrayInkBox();// ʵ�������ӿڣ���̬
//		// ����ӡ����װī�к�ֽ�� ---- set��ֵ
//		printer.setPaper(paper);
//		printer.setInkBox(inkBox);
//		// ʹ�ô�ӡ����ӡ
//		printer.print();
//
//		// 2.��ɫī��A5ֽ��
//		paper = new A5Paper();
//		inkBox = new ColorInkBox();
//		// ����ӡ����װī�к�ֽ�� ---- set��ֵ
//		printer.setPaper(paper);
//		printer.setInkBox(inkBox);
//		// ʹ�ô�ӡ����ӡ
//		printer.print();
		
		// 3.��ɫī��A4ֽ��
		paper = new A4Paper();
		inkBox = new ColorInkBox();
		printer.setPaper(paper);
		printer.setInkBox(inkBox);
		printer.print();
		
		

	}

}
