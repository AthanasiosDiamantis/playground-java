package com.saki.java.chapter03;

import java.awt.Point;

public class Distances {

	public static void main(String[] args) {
		Point player = new Point();
		player.setLocation(10, 10);
		
		Point door = new Point();
		door.setLocation(10, 9);
		
		Point snake = new Point();
		snake.setLocation(19,11);
		
		System.out.println(player.distance(door));
		System.out.println(player.distance(snake));
		System.out.println(player.distance(snake.x, snake.y));
		

	}

}
