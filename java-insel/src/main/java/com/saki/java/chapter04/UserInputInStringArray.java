package com.saki.java.chapter04;

import java.util.Scanner;

public class UserInputInStringArray {

	public static void main(String[] args) {

		String[] validInputs = {"Banane", "Kirsche", "Apfel", "Aprikose", "Birne"};
		
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		while (!found) {
			System.out.println("Bitte versuche eine Frucht einzugeben!");

			String input = sc.nextLine();

			for (String s: validInputs) {
				if (s.equals(input) ) {
					System.out.printf("Du hast '%s' eingegeben",s);
					found = true;
					break;
				}
			}
		}
		sc.close();

		System.out.println("\nDamit hast Du das richtige Früchtchen eingegeben! \n"
				+ "das Spiel ist zuende");
	}

}
