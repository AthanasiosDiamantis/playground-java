package com.JavaInsel.Chapter4.ArraysUndAnwendungen;


public class PrintTheAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = {1.6,6.3,4.5,13.5,6.6,9.8,7.9,23.3};
		
		double sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("the sum of numbers is: " + sum);
		double average = sum/numbers.length;
		System.out.printf("the average of the numbers is: %.3f", average);
		
		System.out.println("\n  ######################### \n");
		char[] alphabet = new char['z' - 'a'+1 ];
		
		for ( char c = 'a'; c <= 'z' ; c++) {
			alphabet[c - 'a'] = c;
			System.out.print(c + ", ");
		}
		System.out.println("\n********* provoke some Exceptions **************\n");
		
		// provoke a nullpointer Exeption
//		int[] arrayNullPointer = null;
//		arrayNullPointer[1] = 1;
		
		// provoke an indexOutOfBoundsException 
//		int[] array100 = new int[100];
//		array100[-10] = 1;
//		array100[100] = 1;
//		
		// Should`t use this code
		
		int[] arrayCount = {2,4,6,2,7};
		int i = 0;
		while (i< arrayCount.length) {
			System.out.println(arrayCount[i]);
			i++; //possible, but NOT recommended!!!!
		}

	}

}
