package com.JavaInsel.Chapter4.ArraysUndAnwendungen;


public class Avg1 {
	
	static double avg(double[] array) {
		double sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
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
