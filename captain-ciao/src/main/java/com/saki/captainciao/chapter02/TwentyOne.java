/**
 * bigger than 21 loses. less than 2 finishes the game
 * @author athanasios diamantis
 * @version 1.03
 * @date 07th of October 2022
 * From Captain CiaoCiao
 * Chapter 2
 */

package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class TwentyOne {

	public static void main(String[] args) {
		// variables
		int dealer;
		int player;

		@SuppressWarnings("unused")
		final int MAX_SCORE = 21;

		Scanner scan = new Scanner(System.in);
		// read in dealer and player
		dealer = scan.nextInt();
		player = scan.nextInt();
		scan.close();
		// if one < 2 break
		if (dealer < 2 || player < 2 ) {
			return;
		}

		// check if one is over 21 --> then write 0
		if (dealer > 21 && player > 21) {
			System.out.println( 0 );
		} else if (dealer > 21 ) {
			System.out.println(player);
		} else if (player > 21 ) {
			System.out.println(dealer);
		// otherwise the biggest number wins
		} else {
			System.out.println(Math.max(player, dealer));
		}

			System.out.println();

		// TODO Auto-generated method stub

	}

}
