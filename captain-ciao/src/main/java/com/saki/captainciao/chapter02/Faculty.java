/**
 * a program to calculate faculties
 * @author: athanasios diamantis
 * @version 1.02
 * @datum 3rd of November 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class Faculty {
	public static void main(String[] args) {
		// variables
		int inputNumber = 0;
		long result = 1;

		// Input order
		System.out.println("Pleas entet a positiv integer: ");
		Scanner scan = new Scanner(System.in);
		inputNumber = scan.nextInt();


		if (inputNumber < 0) {
			System.out.println("ups, why so negativ ;-( try again!");
		}
		else if (inputNumber == 0) {
			System.out.println("0! = 1");
		}
		else if (inputNumber == 1) {
			System.out.println("1! = 1");
		}
		else {
			System.out.printf("result from: %s! = ",inputNumber);
			for (int i = 1; i <= inputNumber; i++) {

				// multiplies two numbers and returns the result
				result = Math.multiplyExact(result, i);
				 System.out.print(
						 (i < inputNumber) ? (i + " * "): (i)
								 );

			}
			System.out.print(" = " + result);

		}
		scan.close();
	}

}
