package com.JavaInsel.Chapter3.KlassenUndObjekte;

import java.awt.Point;

public class PlayerAndDoorAsPoints {

	public static void main(String[] args) {
		Point player = new Point();
		player.x = player.y = 10;
		
		Point door = new Point();
		door.setLocation(10, 100);
		
		System.out.println( player.distance(door));
		System.out.println(player.toString());
		System.out.println(door);

	}

}
