/**
 * program checks various entries of money amounts
 * @author athanasios diamantis
 * @version 1.09
 * @date 7th of October 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class PayDayWatch {

	public static void main(String[] args) {
		// variables
		double moneyAmount = 0;
		double dealAmount = 1000;
		double lowerFactor = 0.90; // -10%
		double upperFactor = 1.20; // +20%

		System.out.println("Pleas pay the amount of 1.000 Lirettas for the watch \n"
				+ "to me. I wonder if you pay the full amount");
		Scanner scan = new Scanner(System.in);
		moneyAmount = scan.nextDouble();
		/*
		if ( moneyAmount >= 1_000*lowerFactor && moneyAmount <= 1_000*upperFactor )
			System.out.println("good boy!");
		else
			System.out.println("son of a bi***!");
		*/
		System.out.println(
				( moneyAmount >= dealAmount*lowerFactor &&
				moneyAmount <= dealAmount*upperFactor )
				? "good boy!" : "son of a bi***!"
				);


		// TODO Auto-generated method stub

	}

}
