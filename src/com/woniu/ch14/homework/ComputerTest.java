package com.woniu.ch14.homework;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		CPU cpu;HardDisk hardDisk;Memory memory;
		cpu = new CPU_Intel();
		hardDisk = new HardDisk_300GB();
		memory = new Memory_4GB();
		computer.setCpu(cpu);
		computer.setHardDisk(hardDisk);
		computer.setMemory(memory);
		computer.Assembly();
	}

}
