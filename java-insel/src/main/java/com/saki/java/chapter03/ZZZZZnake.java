/**
 * 
 * This program simulates an old game named snake. Target is to 
 * get the $-coin and after to reach the door before the snake bites you.
 * 
 * @author saki
 * @date 05th of February 2023
 * @version 0.0.2
 *
 */

package com.saki.java.chapter03;

import java.awt.Point;
import java.util.Scanner;

public class ZZZZZnake {

	public static void main(String[] args) {

		// creates the game players
		Point nullPosition = new Point();
		Point playerPosition = randomStartPosition(nullPosition);
		
		Point snakePosition1 = randomStartPosition(playerPosition);
		Point snakePosition2 = randomStartPosition(snakePosition1);
		
		Point goldPosition = randomStartPosition(snakePosition1);
		
		Point doorPosition = randomStartPosition(goldPosition);
		boolean rich = false;
		boolean continueGame = true;
		int movementCounter = 0;
		
		// the main game works within this loop
		while (continueGame) {
			// Raster mit Figuren Zeichnen
			
			for (int y = 0; y < 10; y++) {
				for (int x = 0; x < 40; x++) {
					Point p = new Point(x,y);
					if (playerPosition.equals(p) )
						// on position x,y set player Symbol &
						System.out.print('&');
					else if(snakePosition1.equals(p) )
						// on position x,y set snake Symbol S
						System.out.print('S');
					else if(snakePosition2.equals(p) )
						// on position x,y set snake Symbol S
						System.out.print('s');
					else if(goldPosition.equals(p) )
						// on position x,y set gold Symbol $
						System.out.print('$');
					else if (doorPosition.equals(p) )
						// on position x,y set door Symbol #
						System.out.print('#');
					else
						System.out.print('.');
				}
				if ( y == 9 ) {
					movementCounter++;
				}
				System.out.println();

			}

			playerMovement(playerPosition);
			
			snakeMovement(playerPosition, snakePosition1, movementCounter);
			snakeMovement(playerPosition, snakePosition2, movementCounter);
			
			continueGame = checkGameStatus(rich, playerPosition, doorPosition, snakePosition1, snakePosition2, goldPosition, continueGame);
		
		} // end while
		System.out.println("#### -->  Game Over <-- ####");

	}
	public static void snakeMovement(Point playerPosition, Point snakePosition, int movementCounter) {
		// Schlange bewegt sich in Richtung Spieler
		
		if (movementCounter%4 != 0) {
			
			if ( playerPosition.x < snakePosition.x) {
				snakePosition.x--;
			}
			else if ( playerPosition.x > snakePosition.x) {
				snakePosition.x++;
			}
			else if ( playerPosition.y < snakePosition.y) {
				snakePosition.y--;
			}
			else if ( playerPosition.y > snakePosition.y) {
				snakePosition.y++;
			}
		}
	}
	/**
	 * 
	 * @param rich
	 * @param playerPosition
	 * @param doorPosition
	 * @param snakePosition1
	 * @param goldPosition
	 * @param continueGame
	 * @return returns a boolean to continue or stop the game
	 */
	public static boolean checkGameStatus(boolean rich, Point playerPosition, Point doorPosition, 
			Point snakePosition1, Point snakePosition2, Point goldPosition, boolean continueGame) {
		// Status feststellen
		
		if (rich && playerPosition.equals(doorPosition) ) {
			System.out.println("Gewonnen!");
			continueGame = false;
		}
		if (playerPosition.equals(snakePosition1) || playerPosition.equals(snakePosition2)) {
			System.out.println("ZZZZZZZZZZ. Die Schlange hat Dich!");
			continueGame = false;
		}
		if (playerPosition.equals(goldPosition) ) {
			rich = true;
			goldPosition.setLocation(-1, -1);
			continueGame = true;
		}
		return continueGame;
	}

	public static void playerMovement(Point playerPosition) {

			switch ( new Scanner(System.in).next()) {
			// Spielfeld im Bereich 0/0..39/9
			case "t": playerPosition.y = Math.max( 0, playerPosition.y - 1); break;
			case "h": playerPosition.y = Math.min( 9, playerPosition.y + 1); break;
			case "r": playerPosition.x = Math.max( 0, playerPosition.x - 1); break;
			case "l": playerPosition.x = Math.min(39, playerPosition.x + 1); break;			
			}
//		sc.close();
	}
	
	// randomize method sets start position of players
	public static Point randomStartPosition (Point formerPlayerPosition) {
			int x;
			int y;
		do {
			x = (int) ( Math.random()*40 ); // 0..9
			y = (int) ( Math.random()*10 ); // 0..39
		} while ( formerPlayerPosition.x == x && formerPlayerPosition.y == y);

		Point result = new Point(x,y);
		return result;
		
	}

}
