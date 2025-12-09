/**
 * This solution is from Ullenboom
 * checks if a number is a factorial Number
 * @author athanasios diamantis
 * @version 1.03
 * @date 4th of November 2022
 * From Captain CiaoCiao
 * Chapter 2
 */
package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class FactorialNumberUB {
	public static void main(String[] args) {
		// variables
		long n = 0;

		System.out.println("Pleas enter an integer and I will check \n"
				+ "wether it is a faculty or not");

		Scanner scan = new Scanner(System.in);

		n = scan.nextLong();

		if (n < 1) {
			System.out.println("Sorry, but faculties are always >=1 !");
		} else {
			long number = n;
			long divisor = 2;

			while(number % divisor == 0) {
				number /= divisor;
				divisor++;
			}
			if (number == 1) {
				System.out.printf("%nyour entry: %d is faculty %d! Congratulations!!!!%n", n, divisor-1);
			}
			else {
				System.out.printf("%nyour entry: %d is NO faculty %n", n);


			}
		}
		scan.close();
	}

}
