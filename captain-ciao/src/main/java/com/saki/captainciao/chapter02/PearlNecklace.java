/**
 * prints 50 circles one next to the other
 * @author athanasios diamantis
 * @version 1.04
 * @date 12th of October 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

// www.w3schools.com/graphics/tryit.asp?filename=trysvg_circle

package com.saki.captainciao.chapter02;

public class PearlNecklace {
	public static void main(String[] args) {
		// variables
		int cxAxis = 20;
		String color = "";
		System.out.println("<svg height=\"100\" width=\"1000\">");

		for (int i = 0; i < 50; i++) {
			double randomizer = Math.random();

			//orange
			if (randomizer <= 1./3) {
				color = "orange";
				System.out.printf("\t<circle cx=\"%s\" cy=\"20\" r=\"5\" fill=\"%s\"/>", cxAxis, color);
			}
			//green
			else if( randomizer >= 1./3 && randomizer >= 2./3) {
				color = "green";
				System.out.printf("\t<circle cx=\"%s\" cy=\"20\" r=\"5\" fill=\"%s\"/>", cxAxis,color);
			}
			// blue
			else {
				color = "blue";
				System.out.printf("\t<circle cx=\"%s\" cy=\"20\" r=\"5\" fill=\"%s\"/>", cxAxis,color);
			}
			cxAxis +=10;
			System.out.println("");

		}


		System.out.println("</svg>");
	}

}
