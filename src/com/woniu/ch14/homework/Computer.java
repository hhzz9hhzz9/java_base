/**
 * 
 */
package com.woniu.ch14.homework;

/**
 * 电脑
 * 
 * @author Administrator
 *
 */
public class Computer {
	/**
	 * 将接口作为属性，就是建立了关联关系
	 */
	private CPU cpu;
	private HardDisk hardDisk;
	private Memory memory;
	/**
	 * 给CPU，硬盘，内存赋值
	 */
	
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	
	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}
	
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	/**
	 * 组装电脑
	 */
	public void Assembly() {
		System.out.println("计算机的信息如下：");
		System.out.println("CPU的品牌是："+cpu.getBrand()+"，主频是："+cpu.getHz());
		System.out.println("硬盘容量是："+hardDisk.getSize()+"GB");
		System.out.println("内存容量是："+memory.getSize()+"GB");
	}
	

}
