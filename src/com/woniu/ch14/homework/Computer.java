/**
 * 
 */
package com.woniu.ch14.homework;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public class Computer {
	/**
	 * ���ӿ���Ϊ���ԣ����ǽ����˹�����ϵ
	 */
	private CPU cpu;
	private HardDisk hardDisk;
	private Memory memory;
	/**
	 * ��CPU��Ӳ�̣��ڴ渳ֵ
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
	 * ��װ����
	 */
	public void Assembly() {
		System.out.println("���������Ϣ���£�");
		System.out.println("CPU��Ʒ���ǣ�"+cpu.getBrand()+"����Ƶ�ǣ�"+cpu.getHz());
		System.out.println("Ӳ�������ǣ�"+hardDisk.getSize()+"GB");
		System.out.println("�ڴ������ǣ�"+memory.getSize()+"GB");
	}
	

}
