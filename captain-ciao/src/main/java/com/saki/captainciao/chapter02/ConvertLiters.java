/**
 * program identifies first, if entry is bigger one or smaller.
 * if smaller than result in cl or ml
 * @author athanasios diamantis
 * @version 1.01
 * @date 11th of October 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class ConvertLiters {

	public static void main(String[] args) {
		// variables
		double entryLiter = 0;
		long aproxLiter = 0;
		int milliLitter = 0;

		System.out.println("Enter Liter please!");
		Scanner scan = new Scanner(System.in);
		entryLiter = scan.nextDouble();

		// check if bigger than 1
		if (entryLiter >= 1) {
			aproxLiter = (long)entryLiter;
			System.out.println(
					(aproxLiter == 1 ) ?
					"your entry is aproximatly : " + aproxLiter + " Liter" :
					"your entry is aproximatly : " + aproxLiter + " Liters"
					);
		}
		else {
			milliLitter = (int)(entryLiter*1000);
			if( milliLitter >= 100 ) {
				System.out.println("your entry is aproximatly : " + milliLitter/100 + " cl");
				}
			else {
				System.out.println("your entry is aproximatly : " + milliLitter + " ml");
			}
		}
		scan.close();
	}
}