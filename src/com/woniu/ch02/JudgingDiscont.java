package com.woniu.ch02;

import java.util.Scanner;

public class JudgingDiscont {
	public static void main(String[] args) {
		/*
		 * ªÒ»°’€ø€
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("«Î ‰»Î’€ø€£∫");
		double discont = sc.nextDouble();
		
		int shirtPrice = 245;// T–Ùº€∏Ò
		int shoePrice = 570;// Õ¯«Ú–¨º€∏Ò
		int racketPrice = 320;// Õ¯«Ú≈ƒº€∏Ò
		/*
		 * ≈–∂œ’€ø€
		 */
		boolean shirtJudging = (shirtPrice * discont) < 100.0;
		boolean shoeJudging = (shoePrice * discont) < 100.0;
		boolean racketJudging = (racketPrice * discont) < 100.0;
		System.out.println("T–Ù’€ø€º€µÕ”⁄100¬£ø" + shirtJudging);
		System.out.println("Õ¯«Ú–¨’€ø€º€µÕ”⁄100¬£ø" + shoeJudging);
		System.out.println("Õ¯«Ú≈ƒ’€ø€º€µÕ”⁄100¬£ø" + racketJudging);
		sc.close();
	}
}
