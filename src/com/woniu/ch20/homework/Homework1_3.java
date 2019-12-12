package com.woniu.ch20.homework;

import java.util.Timer;
import java.util.TimerTask;

public class Homework1_3 {
	private static final long PERIOD_DAY = 24 * 60 * 60 * 1000;//间隔毫秒数
	public static class MyTask extends TimerTask {
		@Override
		public void run() {
			try {
				LineNumsOutput.output();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.gc();
				System.out.println("行数统计成功");
			}
		}
	}

	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTask mt = new MyTask();
		timer.schedule(mt, 1000, PERIOD_DAY);
	}
}
