/**
 * a program to detect the correct spelling while checking the amount
 * eg. one bottle tho bottles
 * @author athanasios diamantis
 * @version 1.06
 * @date 06th of October 2022
 * from Captain CioaCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class BottleGrammar {

	public static void main(String[] args) {
		// variables
		int noOfBottles = 0;

		System.out.println("Pleas enter the number of bottles and press ENTER after!");
		Scanner scan = new Scanner(System.in);
		noOfBottles = scan.nextInt();

		// check with conditional operator
		System.out.println( noOfBottles + " bottle" +
				((noOfBottles == 1) ? "" : "s")
				+ " of rum\n"
				);

		System.out.printf( "%s bottle%s of rum",noOfBottles,
				(noOfBottles == 1) ? "":"s");
		scan.close();
		// TODO Auto-generated method stub

	}

}
