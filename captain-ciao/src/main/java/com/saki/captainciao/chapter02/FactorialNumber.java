/**
 * checks if a number is a factorial Number
 * @author athanasios diamantis
 * @version 1.03
 * @date 4th of November 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// variables
		long inputNumber = 0;
		long checkNumber = 0;
		int modoloNumber = 1;
		long newFaculty = 1;
		System.out.println("Pleas enter a number to check wether it is a faculty number: ");

		Scanner scan = new Scanner(System.in);
		inputNumber = scan.nextLong();
		checkNumber = inputNumber;

		while (checkNumber % modoloNumber == 0) {
			System.out.printf(
					"%d : %d = %d %n",checkNumber, modoloNumber, (checkNumber = checkNumber/modoloNumber));
			modoloNumber++;


		}
		System.out.printf("End of 1st process and the modolo-Number is: %d"
				+ "%n::::::::::::::::::::::::::::::::::::"
				+ "%nStart of checking process...%n",modoloNumber);
		// check if inputNumber is equivalent to the new calculated faculty
		for (int i = 1; i < modoloNumber; i++) {
			newFaculty = Math.multiplyExact(newFaculty, i);
		}
		System.out.printf("faculty of %d! = %d %n", (modoloNumber-1), newFaculty);
		if (newFaculty == inputNumber) {
			System.out.println("Number is a faculty!");
		}
		else {
			System.out.println("No faculty");
		}

		// TODO Auto-generated method stub

		scan.close();
	}
}
