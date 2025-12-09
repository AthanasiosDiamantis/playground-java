/**
 * a program which sums all liratta money entries, if you enter Zero, the program ends
 * and displays the sum of the deposit
 * @author athanasios diamantis
 * @version 1.06
 * @datum 14th of October 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class SummingCalculator {

	public static void main(String[] args) {
		// variables
		int lirettaDeposit = 0;
		int entry;

		Scanner scan = new Scanner(System.in);

		System.out.println("Pleas enter your Liretta amount: ");
		do {
			entry = scan.nextInt();
			lirettaDeposit += entry;
			System.out.printf("your new deposit amount: %d %n", lirettaDeposit);
		} while (entry != 0);

		System.out.printf("You saved: %d Lirettas in your Deposit up to now!",lirettaDeposit);

		// solution from Ullenboom
		// variables
		final int END_OF_ENTRY = 0;
		// reset declared variable "lirettaDeposit" from above
		lirettaDeposit = 0;
		System.out.println("Pleas enter AGAIN a Liretta amount: ");
		for ( int entry2;
			( entry2 = new Scanner(System.in).nextInt() ) != END_OF_ENTRY;) {
			lirettaDeposit += entry2;
			System.out.printf("your new deposit amount: %d %n", lirettaDeposit);
		}

		System.out.printf("You saved: %d Lirettas in your Deposit up to now!",lirettaDeposit);
		scan.close();
		// TODO Auto-generated method stub

	}

}
