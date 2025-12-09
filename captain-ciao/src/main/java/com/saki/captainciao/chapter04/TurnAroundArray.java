package com.saki.captainciao.chapter04;

import java.util.Arrays;

public class TurnAroundArray {
	public static void main(String[] args) {
		double[] testArray = {};
		double[] testArray1 = {1};
		double[] testArray2 = {1,2};
		double[] testArray3 = {1,2,3,};
		double[] testArray4 = {1,2,3,4,5,6,7,8,9};
		
		System.out.println( Arrays.toString(testArray) );		
		System.out.println( Arrays.toString(testArray1) );		
		System.out.println( Arrays.toString(testArray2) );		
		System.out.println( Arrays.toString(testArray3) );	
		System.out.println( Arrays.toString(testArray4) );
		
		reverse(testArray1);
		reverse(testArray2);
		reverse(testArray3);
		reverse(testArray4);
		

		System.out.println( Arrays.toString(testArray4) );
		System.out.println( Arrays.toString(testArray3) );
		System.out.println( Arrays.toString(testArray2) );
		System.out.println( Arrays.toString(testArray1) );
		
	}
	
	public static void reverse(double[] numbers) {
		final int MIDDLE = numbers.length/2;
		//TODO
		double tempFirst;
		double tempLast;

			for (int i = 0; i < MIDDLE; i++) {
				tempFirst = numbers[i];
				tempLast = numbers[(numbers.length-1)-i];
				numbers[i] = tempLast;
				numbers[(numbers.length-1)-i] = tempFirst; 
				
			}

//		else {
//			for (int left = 0; left < numbers.length/2+1; left++) {
//				tempFirst = numbers[left];
//				tempLast = numbers[(numbers.length-1)-left];
//				numbers[left] = tempLast;
//				numbers[(numbers.length-1)-left] = tempFirst; 
//			}
//			
//		}

	}

}
