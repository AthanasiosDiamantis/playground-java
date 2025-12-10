package com.saki.java.chapter04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryBannerModified {

	static void printLetter( char[][] letter ) {
		for ( int line = 0 ;line < letter.length ; line++) {
			for ( int column = 0; column < letter[0].length; column++) {
				System.out.print(letter [line] [column]);

			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void printZero() {
		char[][] zero = { 
				{' ','#',' '},
				{'#',' ','#'},
				{'#',' ','#'},
				{'#',' ','#'},
				{' ','#',' '}
		};
		printLetter(zero);
	}
	
	static void printOne() {
		char[][] one = {
				{' ','#',' '},
				{'#','#',' '},
				{' ','#',' '},
				{' ','#',' '},
				{' ','#',' '}
		};
		printLetter(one);
	}

	static char[][] binaryZero() {
		char[][] zero = { 
				{' ',' ','#',' ',' '},
				{' ','#',' ','#',' '},
				{' ','#',' ','#',' '},
				{' ','#',' ','#',' '},
				{' ',' ','#',' ',' '}
		};
		return zero;
	}
	
	static char[][] binaryOne() {
		char[][] one = {
				{' ',' ','#',' ',' '},
				{' ','#','#',' ',' '},
				{' ',' ','#',' ',' '},
				{' ',' ','#',' ',' '},
				{' ',' ','#',' ',' '}
		};
		return one;
	}
	static void printBinarySequence(char[][] binaryZero, char[][] binaryOne, String binaryNumber) {
		int lineLength = 5;
		int letterPixel = 5;
		int columnLength = binaryNumber.length()*letterPixel;
		int binaryCharAtPosition = 0;
		
		char[][] binarySequence = new char[lineLength][columnLength];
		// filling the Array
		for (int line = 0; line < binarySequence.length; line++) {
			 int columnLetterCounter = 0;
			 binaryCharAtPosition = -1;
			for (int column = 0; column < binarySequence[0].length; column++) {
				// if Zero select the Zero lines/columns if One then do the same
				// prevents columnLetterCounter from becoming greater than 3

				if (column %letterPixel == 0 || column == 0) {
					// identifies the character at the specific position for the switch 
					binaryCharAtPosition++;
					columnLetterCounter =0;
				}
				//binarySequence[line][column] = binaryZero[line][columnLetterCounter];
				switch (binaryNumber.charAt(binaryCharAtPosition) ) {
				case '0' : { 
					binarySequence[line][column] = binaryZero[line][columnLetterCounter];
					break;
				}
				case '1' : {
					binarySequence[line][column] = binaryOne[line][columnLetterCounter];
					break;
				}
				}
				
			 columnLetterCounter++;
			}
		}
		printLetter(binarySequence);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean notANumber = true;
		
		while (notANumber) {

			notANumber = false;
		try {
			int input = sc.nextInt();
			// int input = new Scanner(System.in).nextInt();
			String bin = Integer.toBinaryString(input);
			System.out.printf("Banner for %s (binär %s): %n", input, bin);
			for (int i = 0; i <bin.length(); i++) {
				switch ( bin.charAt(i) ) {
				case '0': printZero(); break;
				case '1': printOne(); break;
				}
				
			}
			printBinarySequence(binaryZero(), binaryOne(), bin);
		} catch (InputMismatchException e) {
			notANumber = true;
			System.out.println("ups, wrong character! Only Numbers are allowed! \n "
					+ "try again!");
			//e.printStackTrace();
			sc.nextLine();
			// TODO: handle exception
		}
		
	}

		sc.close();
	
	}
}
