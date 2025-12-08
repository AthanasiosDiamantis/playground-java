package com.JavaInsel.Chapter3.KlassenUndObjekte;

import java.awt.Point;

public class DrawPlayerAndSnake {
	
	
	public static void main(String[] args) {
		Point playerPosition = new Point();
		Point snakePosition = new Point();
		System.out.println(playerPosition);
		System.out.println(snakePosition);
		initializeToken(playerPosition);
		initializeToken(snakePosition);
		System.out.println(playerPosition);
		System.out.println(snakePosition);
		printScreen(playerPosition, snakePosition);
		
		
	}
	
	static void initializeToken (Point p) {
		int randomX = (int) (Math.random() * 40 ); // 0...39 Integer
		int randomY = (int) (Math.random() * 10 ); // 0...39 Integer
		p.setLocation(randomX, randomY);
	}
	
	static void printScreen(Point playerPosition, Point snakePosition) {
		// draw field
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 40; x++) {
				
				if (snakePosition.distanceSq(x,y) == 0) {
					System.out.print('S');
				}
				else if (playerPosition.distanceSq(x, y) == 0) {
					System.out.print('&');
				}
				else {
					System.out.print('.');
				}
			}
			System.out.println("");
		}
		
	}

}
