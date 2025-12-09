/**
 * produces a flag or alternately a tree
 * @author athanasios diamantis
 * @verion 0.2.0
 * @date 08th of November 2022
 * From Captain CiaoCiao
 * Chapter 2
 */
package com.saki.captainciao.chapter02;

public class FlagInTheWind {

	public static void main(String[] args) {
		// variables and constants
		final int MAX = 9;
		// modified and inspired from Ullenbooms solutions
		for (int i = 1; i <= MAX; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("\n------------------------\n");

		// centered output
		for (int i = 1; i <= MAX; i++) {
			for (int indent = 0; indent < (MAX -i); indent++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			// System.out.print(i);
			System.out.println();
		}

	}
}
