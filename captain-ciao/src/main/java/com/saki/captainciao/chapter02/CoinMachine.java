/**
 * a program which asks for entering an amount of money in Euro. Afterwards
 * it analyzes how many coins are necessary for that amount.
 * @author: athanasios diamantis
 * @version: 1.06
 * @date 04 October 2022
 * from Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class CoinMachine {
	public static void main(String[] args) {

		// variables
		double moneyAmount = 0.00;
		double restEuroAmount = 0.00;
		int restCentAmount = 0;
		int euro2Coin = 0;
		int euro1Coin = 0;
		int cent50Coin = 0;
		int cent20Coin = 0;
		int cent10Coin = 0;
		int cent05Coin = 0;
		int cent02Coin = 0;
		int cent01Coin = 0;

		System.out.println("Pleas enter amount of money, now! and hit ENTER");
		// type in money amount
		Scanner scan = new Scanner(System.in);
		moneyAmount = scan.nextDouble();
		restEuroAmount = moneyAmount;
		if (restEuroAmount >=1) {
			euro2Coin = ((int) restEuroAmount)/2;
			restEuroAmount = restEuroAmount - 2*euro2Coin;
			euro1Coin = ((int) restEuroAmount)/1;
		}
		restCentAmount = (int) (restEuroAmount * 100);
		// 50 cent coins
		cent50Coin = restCentAmount/50;
		restCentAmount = restCentAmount - 50*cent50Coin;
		// 20 cent coins
		cent20Coin = restCentAmount/20;
		restCentAmount = restCentAmount - 20*cent20Coin;
		// 10 cent coins
		cent10Coin = restCentAmount/10;
		restCentAmount = restCentAmount - 10*cent10Coin;
		// 05 cent coins
		cent05Coin = restCentAmount/5;
		restCentAmount = restCentAmount - 5*cent05Coin;
		// 02 cent coins
		cent02Coin = restCentAmount/2;
		restCentAmount = restCentAmount - 2*cent02Coin;
		// 01 cent coins
		cent01Coin = restCentAmount/1;
		restCentAmount = restCentAmount - 1*cent01Coin;

		System.out.printf(
				"You entered: %.2f%n"
				+ "this means you get the following coins:%n%n"
				+ "%s x 2 Euro%n"
				+ "%s x 1 Euro%n"
				+ "%s x 50 Cent%n"
				+ "%s x 20 Cent%n"
				+ "%s x 10 Cent%n"
				+ "%s x 05 Cent%n"
				+ "%s x 02 Cent%n"
				+ "%s = 01 Cent%n",
				moneyAmount,
				euro2Coin,
				euro1Coin,
				cent50Coin,
				cent20Coin,
				cent10Coin,
				cent05Coin,
				cent02Coin,
				cent01Coin);

	}

}
