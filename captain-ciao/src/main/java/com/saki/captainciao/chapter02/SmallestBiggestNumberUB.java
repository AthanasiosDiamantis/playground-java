/**
 * This solution is inspired by the solution of Ullenboom
 * program checks the entry of an integer and returns the smallest and biggest number of it
 * e.g. 123445 ->> smallest number = 1 biggest number = 5
 * @author athanasios diamantis
 * @version 0.1
 * @date 4th of November 2022
 * From Captain CiaoCiao
 * Chapter 2
 */
package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class SmallestBiggestNumberUB {

	public static void main(String[] args) {

		// variables
		long inputNumber;

		System.out.println("Pleas enter an integer and I will guess \n"
				+ "the smallest and the biggest digit out of it!");
		Scanner scan = new Scanner(System.in);
		inputNumber = scan.nextLong();

		long biggestNumber = 0;
		long smallestNuber = inputNumber == 0 ? 0:9;

		for ( long value = Math.abs(inputNumber); value != 0; value /=10) {
			long lastDigit = value % 10;
			biggestNumber = Math.max(biggestNumber, lastDigit);
			smallestNuber = Math.min(smallestNuber, lastDigit);
		}
		System.out.printf("yout entry is :%d%n"
				+ "biggest number: %d%n"
				+ "smallest number: %d%n", inputNumber, biggestNumber, smallestNuber);

		scan.close();
		// TODO Auto-generated method stub

	}

}
