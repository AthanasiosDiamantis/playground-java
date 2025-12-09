package com.saki.captainciao.chapter02;

/**
 * program finds solutions for calculations with letters
 *
 * @author saki
 * @version 0.1.0
 * @date 18th of November 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

public class CodeCracker {
	public static void main(String[] args) {
		// variables
		// char X,O,L,T;
		int summand1, summand2, sum;

		// xol + lxx = tlt

		for (int x = 0; x <10; x++) {
			for (int o = 0; o < 10; o++) {
				for (int l = 0; l < 10; l++) {
					for (int t = 0; t < 10; t++) {
						summand1 = x*100 + o*10+l;
						summand2 = l*100 + x*10+x;
						sum = t*100+l*10+t;
						if ( ( (summand1 + summand2) == sum ) ) {
							if( (x!=o) && (x!=l) && (x!=t) && (o!=l) && (o!=t) && (l!=t)) {
								System.out.printf("x = %d, o = %d, l = %d, t = %d -->  ",x,o,l,t);
							}
							System.out.println(summand1 + " + " + summand2 + " = " + sum + " ** true ** ");
						}
					}
				}
			}
		}


}

}
