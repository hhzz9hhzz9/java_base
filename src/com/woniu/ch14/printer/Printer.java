package com.woniu.ch14.printer;

/**
 * 打印机
 * @author Administrator
 *
 */
public class Printer {
	
	//将接口作为属性，就是建立了关联关系
	private InkBox inkBox; //墨盒
	private Paper paper; //纸张
	
	/**
	 * 设置打印机墨盒 --- 给墨盒赋值
	 * @param inkBox
	 */
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	
	/**
	 * 设置打印机纸张 --- 给纸张赋值
	 * @param pager
	 */
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	
	/**
	 * 打印方法 ---- 使用纸张和墨盒打印信息
	 */
	public void print() {
		System.out.println("使用" + inkBox.getColor() + "墨盒在" + paper.getSize() + "纸张上打印");
	}

	
	
	
	

}
