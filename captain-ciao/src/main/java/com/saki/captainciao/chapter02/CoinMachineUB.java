/**
 * This solution is relied on Ullenbooms solution.
 * a program which asks for entering an amount of money in Euro. Afterwards
 * it analyzes how many coins are necessary for that amount.
 * @author: athanasios diamantis
 * @version: 1.06
 * @date 06 October 2022
 * from Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class CoinMachineUB {

	public static void main(String[] args) {

		// variables
		double moneyAmountEuro = 0.00;
		int moneyAmountCent = 0;

		System.out.println("Pleas type in the wished money amount and push ENTER!");
		Scanner scan = new Scanner(System.in);
		moneyAmountEuro = scan.nextDouble();
		// convert euro into cents
		moneyAmountCent = (int) (moneyAmountEuro * 100);
		// calculate 2 euro pieces
		System.out.println(moneyAmountCent/200 + " x 2€");
		moneyAmountCent %= 200;
		// calculate 1 euro pieces
		System.out.println(moneyAmountCent/100 + " x 1€");
		moneyAmountCent %= 100;
		// calculate 50 cent pieces
		System.out.println(moneyAmountCent/50 + " x 50 cent");
		moneyAmountCent %= 50;
		// calculate 20 cent pieces
		System.out.println(moneyAmountCent/20 + " x 20 cent");
		moneyAmountCent %= 20;
		// calculate 10 cent pieces
		System.out.println(moneyAmountCent/10 + " x 10 cent");
		moneyAmountCent %= 10;
		// calculate 05 cent pieces
		System.out.println(moneyAmountCent/5 + " x 05 cent");
		moneyAmountCent %= 5;
		// calculate 02 cent pieces
		System.out.println(moneyAmountCent/2 + "x 02 cent");
		moneyAmountCent %= 2;
		// calculate 01 cent pieces
		System.out.println(moneyAmountCent + "x 01 cent");
		moneyAmountCent %= 1;
		// just test amounts: System.out.println("Euro: " + moneyAmountEuro + "\ncents: " + moneyAmountCent);
		scan.close();
	}

}
