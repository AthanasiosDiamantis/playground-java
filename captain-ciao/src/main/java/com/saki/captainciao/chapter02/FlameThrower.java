package com.saki.captainciao.chapter02;

/**
 * This code produces an html dokument with some variable elements
 * and displays them as a table
 * @author saki
 * @version 0.2.0
 * @datum 20th of December 2022
 * From Captain Ciao Ciao
 * Chapter 2
 * check result on following hp: http://jsfiddle.net/
 */

public class FlameThrower {

	public static void main(String[] args) {
		int linesInTable = 10;
		int flThrowerCost = 500;
		int fiExtCost = 100;

		String productName_1 = "Flamethrower";
		String productName_2 = "Fire extinguisher";

		htmlHeadInclusiveHeader(productName_1, productName_2);
		costTable(linesInTable, flThrowerCost, fiExtCost);
		htmlEnd();

	}
	public static void htmlHeadInclusiveHeader(String product1,String product2, String ...pruducts) {
		System.out.printf("<html>\n"
				+ "  <table>\n"
				+ "     <tr><td>Quantity</th><th>%s</th><th>%s</th></tr>\n",product1, product2);

	}
	public static void costTable (int lengthOfTable, int prodCosts1, int prodCosts2, int ... prodCosts) {
		for (int i = 1; i <= lengthOfTable; i++) {
			System.out.printf("     <tr><td>%d</td><td>%s</td><td>%s</td></tr>\n",i,i*prodCosts1,i*prodCosts2);
		}
	}

	public static void htmlEnd() {
		System.out.println("  </table>\n" + "</html>");
	}


}
