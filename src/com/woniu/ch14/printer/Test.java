package com.woniu.ch14.printer;

public class Test {

	public static void main(String[] args) {

		// 定义打印机
		Printer printer = new Printer();
		// 定义纸张
		Paper paper = null;
		// 定义墨盒
		InkBox inkBox = null;
//
//		// 1、黑白墨盒A4纸张
//		paper = new A4Paper(); // 实现类放入接口，多态
//		inkBox = new GrayInkBox();// 实现类放入接口，多态
//		// 给打印机组装墨盒和纸张 ---- set赋值
//		printer.setPaper(paper);
//		printer.setInkBox(inkBox);
//		// 使用打印机打印
//		printer.print();
//
//		// 2.彩色墨盒A5纸张
//		paper = new A5Paper();
//		inkBox = new ColorInkBox();
//		// 给打印机组装墨盒和纸张 ---- set赋值
//		printer.setPaper(paper);
//		printer.setInkBox(inkBox);
//		// 使用打印机打印
//		printer.print();
		
		// 3.彩色墨盒A4纸张
		paper = new A4Paper();
		inkBox = new ColorInkBox();
		printer.setPaper(paper);
		printer.setInkBox(inkBox);
		printer.print();
		
		

	}

}
