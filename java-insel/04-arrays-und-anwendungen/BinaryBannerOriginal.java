package com.JavaInsel.Chapter4.ArraysUndAnwendungen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryBannerOriginal {

	static void printLetter( char[][] letter ) {
		for ( int column = 0; column < letter[0].length; column++) {
			for ( int line = letter.length -1;line >=0; line--) {
				System.out.print(letter [line][column] );

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
				{' ','#'},
				{'#','#'},
				{' ','#'},
				{' ','#'},
				{' ','#'}
		};
		printLetter(one);
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
