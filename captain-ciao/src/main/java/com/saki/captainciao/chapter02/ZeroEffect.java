/**
 * division with zero, what happened
 */
package com.saki.captainciao.chapter02;

public class ZeroEffect {
	public static void main(String[] args) {
		int zero = 0;
		int ten = 10;

		double anotherTen = 10;
		System.out.println( anotherTen / zero );
		System.out.println( ten / zero );
	}

}
