package com.saki.java.chapter04;


public class Avg2 {
	
	static double avg(double[] array) {
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Array null oder leer");
		}
		double sum = 0;
		
		for (double n : array) {
			sum +=n;
		}
		return sum/array.length;
	}

	public static void main(String[] args) {

		double[] numbers = {2,3,4,7};
		System.out.printf( "the avarage of the following \n"
				+ "numbers %.2f, %.2f, %.2f, %.2f is: %.2f",
				numbers[0],numbers[1],numbers[2],numbers[3], avg(numbers) );
		
	}



}
