package com.JavaInsel.Chapter4.ArraysUndAnwendungen;

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
