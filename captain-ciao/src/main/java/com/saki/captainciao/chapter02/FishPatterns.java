
package com.saki.captainciao.chapter02;
/**
 * draws fish paterns left <>< and right locking ><> fishes
 *
 * @author saki
 * @version 0.1.0
 * @date 17th of November 2022
 * From Captain CioaCiao
 * Chapter 2
 */

public class FishPatterns {
	public static void main(String[] args) {
		final int REPITITIONS =5;
		String fishbody = "<>";
		char fishRight = '>';
		char fishLeft = '<';
		// Zeile
		for (int i = 0; i < REPITITIONS; i++) {
			System.out.print(i+" ");
			// fish looks right
			for (int j = 0; j < REPITITIONS; j++) {
				System.out.print(fishRight + fishbody);
				System.out.print(" ");
			}
			// fish looks light
			for (int k = 0; k < REPITITIONS; k++) {
				System.out.print(fishbody + fishLeft);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
