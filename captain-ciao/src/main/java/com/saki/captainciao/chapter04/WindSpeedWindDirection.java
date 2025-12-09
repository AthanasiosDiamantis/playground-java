package com.saki.captainciao.chapter04;

public class WindSpeedWindDirection {

	public static void main(String[] args) {
		
		final int MAX_SPEED = 200;
		final int MAX_DEGREE = 360;
		
		final int LENGTH_OF_ARRAY = 5;

		int[] windSpeed = new int[LENGTH_OF_ARRAY];
		int[] windDirection = new int[LENGTH_OF_ARRAY];
		int speed = 0; // speed from 0 to < 200 km/h
		int degree = 0; // 0 to < 360 degrees
		
		// Wind speed randomizer
		for (int i = 0; i < LENGTH_OF_ARRAY; i++) {
			speed = (int) (Math.random() *MAX_SPEED);
			degree = (int) (Math.random() * MAX_DEGREE);
			windSpeed[i] = speed;
			windDirection[i] = degree;
			System.out.printf("Wind speed %d km/h and wind direction %d°%s",
					windSpeed[i], 
					windDirection[i],
					(i<LENGTH_OF_ARRAY-1) ? ", " :"");
			if( i%2 != 0 ) 
			System.out.println();;
		}
	}

}
