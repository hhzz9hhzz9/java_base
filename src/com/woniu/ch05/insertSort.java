package com.woniu.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class insertSort {
	public static void main(String[] args) {
		int[] score = { 98, 85, 82, 63, 60 };

		// 1、排序
		Arrays.sort(score);

		// 2.创建新的数组 --- 比原来数组长度+1
		int[] newScore = new int[score.length + 1];

		// 3.拷贝数据
		for (int i = 0; i < score.length; i++) {
			newScore[i] = score[i];
		}

		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int temp = input.nextInt();

		// 4、判断添加的位置 ---- 遍历数组，寻找比temp大的元素位置
		int index = -1;
		for (int i = 0; i < newScore.length; i++) {
			if (newScore[i] >= temp) {
				// 记录下标
				index = i;
				break;
			}
		}

		// 5、从位置处后移元素
		for (int i = newScore.length - 1; i > index; i--) {
			newScore[i] = newScore[i - 1];
		}

		// 6、将temp放入空位置
		newScore[index] = temp;

		System.out.println(Arrays.toString(newScore));
        input.close();
	}

}
