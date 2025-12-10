package com.saki.java.chapter04;

import java.awt.Point;
import java.util.Arrays;

public class FivePlayers {
	public static void main(String[] args) {
		
		// produce Array of players
		Point[] players = new Point[5];
		
		for (int i = 0; i < players.length; i++) {
			int xCo = (int) (Math.random()*40 );
			int yCo = (int) (Math.random()*10 );
			players[i] = new Point( xCo, yCo );
		}
		
		// produce the field for positioning the players 
		for (int y = 0; y < 10; y++) {
			for (int x =0; x < 40; x++ ) {
				if (Arrays.asList(players).contains( new Point(x,y) ) ) {
					System.out.print("&");
				}
				else {
					System.out.print(".");					
				}
			}
			System.out.println();	
		}
	}

}
