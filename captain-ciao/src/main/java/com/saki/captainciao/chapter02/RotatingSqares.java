/**
 * repetition of 36 spares
 * @author athanasios diamantis
 * @version 1.09
 * @date 11th of October 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

// www.w3schools.com/graphics/tryit.asp?filename=trysvg_circle

package com.saki.captainciao.chapter02;

public class RotatingSqares {

	public static void main(String[] args) {

		// Ullenboom solution
		System.out.println("<svg height=\"200\" width=\"200\">");

		for ( int rotationDegree = 0; rotationDegree < 360; rotationDegree+=10 ) {
			System.out.printf("\t<rect x=\"60\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" fill=\"none\" "
					+ "\n\t\t transform=\"rotate(%d 100 100)\" />%n", rotationDegree);

		}
		System.out.println("/svg>");

		/* my solution !!!
		// variables
		int rotationDegree = 0;

		for (int i = 0; i <36; i++) {
			// constructs a square
			System.out.printf("<svg height=\"200\" width=\"200\">\n"
					+ "\t<rect x=\"50\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" fill=\"none\" "
					+ "\n\t\t transform=\"rotate(%d 100 100)\" />"
					+ "\n/svg>", rotationDegree+=10);
		}
		*/
	}
}
