/**
 * generates randomized circles with colors: red, green,blue
 * produce print text with svg circles and changing colors
 * @author athanasios diamantis
 * @version 1.02
 * @date 11th of October 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

public class SVGCircleColors {

	public static void main(String[] args) {
		double randomizer = Math.random();

		if (randomizer <= 2./3) {
			System.out.printf("<circle cx=\"60\" cy=\"60\" r=\"50\" fill=\"%s\"/>",
					(randomizer <= 1./3) ? "red":"green");
		}
		else {
			System.out.println("<circle cx=\"60\" cy=\"60\" r=\"50\" fill=\"blue\"/>");
		}

		// www.w3schools.com/graphics/tryit.asp?filename=trysvg_circle

	}

}
