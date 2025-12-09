/**
 * program shows usage of iteration phenomenon
 * @author athanasios diamantis
 * @version 1.03
 * @datum 14th of October 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

public class IterationPhenomenon {

	public static void main(String[] args) {
		// variables
		double t = Math.random()*10; // generates Number between 0 <= t <10 !

		while (t > 0) {
			if( t <1 ) {
				t *= 2;
			} else {
				t--;
			}
			System.out.println("t = " + t);
		}
		System.out.println("Programm beendet / program ends here!");


		// TODO Auto-generated method stub

	}

}
