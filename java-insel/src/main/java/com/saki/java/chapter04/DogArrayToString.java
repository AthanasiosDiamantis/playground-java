package com.saki.java.chapter04;

import java.util.Arrays;

public class DogArrayToString {

	public static void main(String[] args) {
		String[] dogs = {"Monga", "Pituni", "Zelungi", "Alberti", "Cäser", "alberti","Tuffi", "Muffi", "Knuffi","Wuffi"};

		// System.out.println(dogs); unsinnige to String Representation
		System.out.println(Arrays.toString(dogs));
		Arrays.sort(dogs);
		System.out.println(Arrays.toString(dogs));
	}

}
