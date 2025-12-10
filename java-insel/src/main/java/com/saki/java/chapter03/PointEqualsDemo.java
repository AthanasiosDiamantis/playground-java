package com.saki.java.chapter03;

import java.awt.Point;

public class PointEqualsDemo {

	public static void main(String[] args) {
		Point player = new Point();
		player.x = player.y = 10;
		
		Point door = new Point();
		door.setLocation(10, 10);
		
		System.out.println(player.equals(door));
		System.out.println(door.equals(player));
		
		Point snake = new Point();
		snake.setLocation(20, 20);
		System.out.println(snake.equals(door));
	}

}
