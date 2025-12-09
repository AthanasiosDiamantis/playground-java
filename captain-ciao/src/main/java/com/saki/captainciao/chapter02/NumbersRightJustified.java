package com.saki.captainciao.chapter02;

/**
 * the target of this program is to justify integer numbers on the right side.
 *
 * @author athanasios diamantis
 * @version 0.1.0
 * @date 19th of November 2022
 * From Captain CiaoCiao
 * Chapter 2
 */
public class NumbersRightJustified {

	public static void main(String[] args) {
		int givenNumber = 12345;
		int checkNumber;
		int countDigits = 0;

		checkNumber = givenNumber;
		while (checkNumber > 0) {
			countDigits++;
			checkNumber /= 10;
		}
		for ( int i = 0; i < countDigits; i++) {
			System.out.print(" ");
		}
		System.out.print(givenNumber + "\n");
		System.out.println(givenNumber + " -> " + countDigits);
		// TODO Auto-generated method stub

	}

}
