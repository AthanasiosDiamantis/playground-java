package com.saki.captainciao.chapter05;

public class RemoveVowel {

	public static void main(String[] args) {
		removeVowels("Hallo Javanesen");
		removeVowels("NETT SAGEN");
	}

	public static void removeVowels(String string) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'ä', 'ö', 'ü', 'y' };
		String lowString = string.toLowerCase();
		
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (lowString.charAt(i) == vowels[j]) {
					i += 1;
					break;
				}
			}
			System.out.print(string.charAt(i));

		}
		System.out.println();

	}

}
