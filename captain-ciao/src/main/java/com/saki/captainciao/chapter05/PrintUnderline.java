package com.saki.captainciao.chapter05;

public class PrintUnderline {

	public static void main(String[] args) {
		printUnderline("There is more treasure in books than in all the pirates' loot on Treasure Island", "treasure");
		printUnderline("There is more treasure in books than in all the pirates''''''''''' loot on Treasure Island", "treasure");

	}

	public static void printUnderline(String string, String search) {
		String strLowCase = string.toLowerCase();
		String srchLowCase = search.toLowerCase();
		
		if (string.length() < search.length()) {
			System.out.println(string);
			System.out.println("No match in string!");
		} else if (string.length() >= search.length()) {
			System.out.println();
			System.out.println(string);
			
			for (int i = 0; i < string.length() - search.length(); i++) {
				// if detect match write underscore _ search.lenght times and continue behind
				// underscore with search
				if (strLowCase.subSequence(i, i + search.length()).equals(srchLowCase)) {
					for (int j = 0; j < search.length(); j++) {
						System.out.print("_");
					}
					i += search.length();

				} else { // print whitespace
					System.out.print(" ");
				}
			}

		}

	}

}
