/**
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

public class SmallestBiggestNumber {
	public static void main(String[] args) {
		// variables
		long number = 0;
		long temp;
		long smallDigit = 9;
		long bigDigit = 0;

		System.out.println("Pleas enter an integer an I will tell you the smallest and biggest digit within this number!");
		Scanner scan = new Scanner(System.in);
		number = scan.nextLong();

		if (number < 0) {
			number = -number;
		}
		if (number < 10) {
			smallDigit = 0;
		}
		// positiv numbers
		while (number > 0) {
			temp = number % 10;
			if (temp > bigDigit) {
				bigDigit = temp;
			}
			if (temp < smallDigit) {
				smallDigit = temp;
			}
			number /= 10;
			}
		System.out.printf("smallest number: %d and biggest number: %d",smallDigit,bigDigit);

		scan.close();
		}



}
