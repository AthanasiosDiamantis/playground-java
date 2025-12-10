package com.saki.java.chapter07.game.vl;

import java.util.Arrays;
import java.util.Scanner;

public class Playground {

	public static void main(String[] args) {
		Magazine spiegel = new Magazine("Spiegel", 3.50);
		Magazine madMag = new Magazine("Mad Magazine", 2.50);
		Magazine maxim = new Magazine("Maxim", 3.00);
		Magazine neon = new Magazine("Neon", 3.00);
		Magazine ct = new Magazine("c't", 3.30);

		System.out.println(PriceUtils.calculateSum(spiegel, madMag, ct)); // 9.3

		System.out.println(spiegel.compareTo(ct)); // 1
		System.out.println(ct.compareTo(spiegel)); // -1
		System.out.println(maxim.compareTo(neon)); // 0

		Magazine[] mags = { spiegel, madMag, maxim, neon, ct };
		Arrays.sort(mags);
		System.out.println(Arrays.toString(mags)); // [Mad Magazine 2.5, Maxim 3.0, Neon 3.0, c't 3.3, Spiegel 3.5]

		double checkedPrice = 0.00;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter price to be checked, e.g. 435.00 and push enter button");

			while (!sc.hasNextDouble()) {
				System.out.println("hey, thats not a number give it a new try...");
				sc.next();
			}
			checkedPrice = sc.nextDouble();

		} while (checkedPrice <= -30.0);


		// TODO input line heres
		System.out.printf("the amount of %.2f is %s", checkedPrice, Buyable.isValidPrice(checkedPrice) ? "ok":"not ok");

	}
}