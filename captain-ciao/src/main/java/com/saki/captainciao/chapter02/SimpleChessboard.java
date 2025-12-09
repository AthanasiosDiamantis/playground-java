package com.saki.captainciao.chapter02;

import java.util.Scanner;

/**
 * constructs a chessboard in specific width and height
 * @author saki
 * @version 0.1.0
 * @date 12th of November 2022
 * From Captain CiaoCiao
 * Chapter 2
 *
 */
public class SimpleChessboard {

	public static void main(String[] args) {
		// variables
		int width = 0;
		int height = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("I will construct a chessboard!\n"
				+ "Pleas enter width: ");
		width = sc.nextInt();
		System.out.println("thx, now enter height: ");
		height = sc.nextInt();

		for ( int i = 0; i < height; i++) {

			for (int j = 0; j < width; j++) {
				System.out.print( ((i+j) % 2 != 0) ? "_":"#");
//				// this is a switch for starting in different lines with different signs
//				if ((j+i) % 2 != 0) {
//					System.out.print("_");
//				}
//				else {
//					System.out.print("#");
//				}
			}

			System.out.println();

		}

		sc.close();

		// TODO Auto-generated method stub

	}

}
