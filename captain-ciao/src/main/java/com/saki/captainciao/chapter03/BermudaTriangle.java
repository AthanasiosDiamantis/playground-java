package com.saki.captainciao.chapter03;

import java.awt.Point;
import java.awt.Polygon;

public class BermudaTriangle {

	public static void main(String[] args) {
		
		final int DIMENSION = 50;
		final String OCTOPUS = "\uD83D\uDC19";
		final String RAINBOW = "\uD83C\uDF08";

		Polygon bermuda = new Polygon();
		bermuda.addPoint(10, 37);
		bermuda.addPoint(43,  17);
		bermuda.addPoint(18, 5);
		Point ship = new Point(23,23);
		boolean isShipInPolygon = false;
		bermuda = resetWithRandomTriangle(bermuda);
		
		// check if ship is within polygon
		if (bermuda.contains(ship) )
			isShipInPolygon = true;
		
		// rectangle field
		for (int y = 0; y < DIMENSION; y++) {
			for (int x = 0; x < DIMENSION; x++) {
				// print ship Position 
				if(ship.x == x && ship.y == y) {
					System.out.print(printShip(isShipInPolygon));
				}
				else if ( bermuda.contains(x, y) ) {
						System.out.print("x ");
				}
				else {
					System.out.print(". ");
				}

				
			}
			// line break
			System.out.println();
			
		}

	}
	public static String printShip(boolean shipOktopus) {
		
		return shipOktopus ? "\uD83D\uDC19" : "\uD83C\uDF08";
	}
	
	/**
	 * Resets a polygon triangle and returns a new one with new vertex data
	 * @param polygon
	 * @return
	 */
	static Polygon resetWithRandomTriangle(Polygon polygon ) {
		polygon.reset();
		polygon = createRandomTiangel();
		
		return polygon;
	}
	
	/**
	 * 
	 * @return polygon as a triangle
	 */
	static Polygon createRandomTiangel() {
		
		//return random triangle
		int xCoord;
		int yCoord;
		Polygon polygon = new Polygon();
		
		for (int i = 0; i < 3; i++) {
			xCoord = (int) (Math.random()*50);
			yCoord = (int) (Math.random()*50);
			polygon.addPoint(xCoord, yCoord);
		}
		
		return polygon;
	}

}
