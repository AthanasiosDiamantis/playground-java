package com.saki.captainciao.chapter02;

/**
 * program draws a x-mass tree with a specific width and some random ornaments
 *
 * @author saki
 * @version 0.1.0
 * @date 13th of November 2022
 * From Captain CiaoCiao
 * Chapter 2
 */
public class XmasTreeOrnaments {
	public static void main(String[] args) {
	// variables
		int width = 21;
		int unequal = 0;

		if (width % 2 == 0) {
			unequal = 1;
		}
		// Row
		for ( int i = 0; i <= (width/2-unequal); i++) {
			int random = (int) (Math.random()*i*2+1);
			// empty space left side of tree
			for ( int j = 0; j < width/2-i; j++) {
				System.out.print(" ");
			}
			// tree needles counter
			for (int k = 0; k <i*2+1; k++) {

				if (k == random) {
					System.out.print("o");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
