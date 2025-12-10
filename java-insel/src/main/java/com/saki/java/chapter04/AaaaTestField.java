package com.saki.java.chapter04;


public class AaaaTestField {

	public static void main(String[] args) {
		// declaration and initialization of arrays
		
		int[] arrayOfIntegerNumbers = new int[ 10 ];

		arrayOfIntegerNumbers[0] = 4;
		arrayOfIntegerNumbers[1] = 53;
		arrayOfIntegerNumbers[2] = 124;
		arrayOfIntegerNumbers[3] = 6;
		arrayOfIntegerNumbers[4] = 85;
		arrayOfIntegerNumbers[5] = 2;
		arrayOfIntegerNumbers[6] = 76;
		arrayOfIntegerNumbers[7] = 65;
		arrayOfIntegerNumbers[8] = 98;
		arrayOfIntegerNumbers[9] = 012;
		
		for (int i = 0; i < arrayOfIntegerNumbers.length; i++) {
			System.out.println(arrayOfIntegerNumbers[i]);
		} 
		for (int i : arrayOfIntegerNumbers) {
			System.out.println(i);
		}
		System.out.println("Length of array: "+arrayOfIntegerNumbers.length);
		System.out.println("_______________sssssssssssssssss_________________");
		int[] arrayIntNum = { 34,266,346,2346,19,97,};
		for (int i : arrayIntNum) {
			System.out.println("arrayIntNum: " + i);
		}
		System.out.println("the length of the arrayIntNum is: " + arrayIntNum.length);

		System.out.println("\n###############################################\n");
		char[] letter = {'H','a','l','l','o',' ','W','o','r','l','d','!',};
		char firstLetter = letter[0];
		char lastLetter = letter[letter.length-1];
		for (char c : letter) {
			System.out.print(c);
		}
		System.out.println("\nfirst letter: '" +firstLetter + "' & last letter: '" + lastLetter +"'");
	
	int[][] a = new int [3][];
	for ( int i = 0; i < 3; i++ ) {
		a[i] = new int [i+1];
	}
	a[0][0] = 0;
	a[1][0] = 10;
	a[1][1] = 11;
	a[2][0] = 20;
	a[2][1] = 21;
	a[2][2] = 22;
	
	
	for ( int i = 0; i < 3; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.println(a[i][j]);
		}
	}
	}

}
