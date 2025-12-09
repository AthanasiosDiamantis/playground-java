/**
 * checks if certain spelling is within entry and reacts on that
 * @author athanasios diamantis
 * @version 1.03
 * @date 1.03
 * From Captain CiaoCiao
 * Chapter 2
 */
package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class SpellingContains {

	public static void main(String[] args) {
		String entry;

		System.out.println("pleas enter \"Ay\", \"Ay, ay\", \"Ein Ei\", \"yes\" or \"ja\" ");
		Scanner scan = new Scanner(System.in);
		entry = scan.nextLine().toLowerCase();

		if ( entry.contains("ay") ||
				entry.contains("ei") ||
				entry.contains("ja") ||
				entry.contains("yes")) {
			System.out.println("Keep it up!");
		}
		else {
			System.out.println("Don't you dare!");
		}

		// another solution
		System.out.println("Try again...\n" +
		"pleas enter \"Ay\", \"Ay, ay\", \"Ein Ei\", \"yes\" or \"ja\" ");
		entry = scan.nextLine();

		switch(entry) {
		case "Ay":
		case "Ay, ay":
		case "Ein Ei":
		case "yes":
		case "ja":
			System.out.println("Keep it up!");
			break;
			default: System.out.println("Don't you dare!");
		}


	}

}
