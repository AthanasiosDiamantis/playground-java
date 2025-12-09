/**
 * if x > y than Swap the figures
 * @author athanasios diamantis
 * @version 1.01
 * @date 11th of October 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

public class SwapXandY {
	public static void main(String[] args) {
		// variables
		int x = 20;
		int y = 10;
		System.out.println("I:\tx = " + x + " y = " + y);
		if ( x > y ) {
			int swap = x;
			x = y;
			y = swap;
		}
		System.out.println("II:\tx = " + x + " y = " + y);

	}
}
