package com.saki.java.chapter04;

import java.util.Scanner;

public class BigLettersOnScreen {
	public static void main(String[] args) {
		boolean again = true;
		Scanner sc = new Scanner(System.in);
		while (again) {
			System.out.println("Hallo, möchtest Du mal ganz groß sein???\n"
					+ "bitte gib Deinen Namen ein und drücke dann ENTER\n");
			String input = sc.nextLine();
			printSequence6x6Matrix(input);
			System.out.println("\n\nNochmal??? drücke j für weiter!");
			input = sc.nextLine();
			if (input.equalsIgnoreCase("j") ) {
				System.out.println("\nok, super gibt noch mal was ein!\n");
			}
			else {
				again = false;
				System.out.println("...dann nicht, und tschüß!!! Programm wurde beendet");
			}
		}

		sc.close();
		
	}
	
	static void printSequence6x6Matrix(String input) {
		int pixelLength = 6;
		// defines the real row-length of the output Array 
		int sequenceLength = input.length()*pixelLength;
		char[][] sequenceCharArray = new char[pixelLength][sequenceLength];
		// 
		int letterPosCounter;
		int columnBigLetter = 0;

		// fill the sequencePrint
		for (int line = 0; line < pixelLength; line++) {
			letterPosCounter = -1;
			for (int column = 0; column < sequenceLength; column++) {
				if (column % (pixelLength) == 0) {
					letterPosCounter++;
					columnBigLetter = 0;
				}
				sequenceCharArray[line][column] = 
						chooseBigLetter(input.charAt(letterPosCounter))[line][columnBigLetter];
				columnBigLetter++;
			}
		}
		
		// printer method
		for (int line = 0; line < pixelLength; line++) {
			for (int column = 0; column < sequenceLength; column++) {
				System.out.print(sequenceCharArray[line][column]);
				}
			System.out.println();
			}

	}


	private static char[][] chooseBigLetter(Character choose) {
		char lowerCaseChar;
		lowerCaseChar = Character.toLowerCase(choose);
		char[][] selected = null;
		switch (lowerCaseChar) {
		case ' ': {
			selected = whiteSpace();
			break;
		}
		case 'a': {
			selected = letterA();
			break;
		}
		case 'b': {
			selected = letterB();
			break;
		}
		case 'c': {
			selected = letterC();
			break;	
		}
		case 'd': {
			selected = letterD();
			break;	
		}
		case 'e': {
			selected = letterE();
			break;	
		}
		case 'f': {
			selected = letterF();
			break;	
		}
		case 'g': {
			selected = letterG();
			break;	
		}
		case 'h': {
			selected = letterH();
			break;	
		}
		case 'i': {
			selected = letterI();
			break;	
		}
		case 'j': {
			selected = letterJ();
			break;	
		}
		case 'k': {
			selected = letterK();
			break;	
		}
		case 'l': {
			selected = letterL();
			break;	
		}
		case 'm': {
			selected = letterM();
			break;	
		}
		case 'n': {
			selected = letterN();
			break;	
		}
		case 'o': {
			selected = letterO();
			break;	
		}
		case 'ö': {
			selected = letterOE();
			break;	
		}
		case 'p': {
			selected = letterP();
			break;	
		}
		case 'q': {
			selected = letterQ();
			break;	
		}
		case 'r': {
			selected = letterR();
			break;	
		}
		case 's': {
			selected = letterS();
			break;	
		}
		case 't': {
			selected = letterT();
			break;	
		}case 'u': {
			selected = letterU();
			break;	
		}case 'v': {
			selected = letterV();
			break;	
		}case 'w': {
			selected = letterW();
			break;	
		}case 'x': {
			selected = letterX();
			break;	
		}case 'y': {
			selected = letterY();
			break;	
		}case 'z': {
			selected = letterZ();
			break;	
		}
		
		default: {
			selected = unknownLetter();
		}
		}
		return selected;
		// TODO Auto-generated method stub
		
	}

	private static char[][] unknownLetter() {
		char[][] unknown = {
				{' ','#','#',' ',' ',' '},
				{'#',' ',' ','#',' ',' '},
				{' ','#','#',' ',' ',' '},
				{'#',' ',' ',' ',' ',' '},
				{' ','#','#','#',' ',' '},
				{' ',' ','#',' ',' ',' '},
		};
		return unknown;
	}

	static char[][] letterA() {
		char[][] a = {
				{' ',' ','#',' ',' ',' '},
				{' ','#',' ','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
				{'#','#','#','#','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
		};
		return a;
	}	
	
	static char[][] letterB() {
		char[][] b = {
				{'#','#','#','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
				{'#','#','#','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#','#','#','#',' ',' '},
		};
		return b;
	}
	
	static char[][] letterC() {
		char[][] c = {
				{' ','#','#','#',' ',' '},
				{'#','#',' ',' ','#',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#','#',' ',' ','#',' '},
				{' ','#','#','#',' ',' '},
		};
		return c;
	}

	static char[][] letterD() {
		char[][] d = {
				{'#','#','#','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#','#','#','#',' ',' '},
		};
		return d;
	}
	static char[][] letterE() {
		char[][] e = {
				{'#','#','#','#','#',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#','#','#','#','#',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#','#','#','#','#',' '},
		};
		return e;
	}

	static char[][] letterF() {
		char[][] f = {
				{'#','#','#','#','#',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#','#','#','#','#',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#',' ',' ',' ',' ',' '},
		};
		return f;
	}

	static char[][] letterG() {
		char[][] g = {
				{' ','#','#','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#',' ','#','#','#',' '},
				{'#',' ',' ',' ','#',' '},
				{' ','#','#','#',' ',' '},
		};
		return g;
	}

	static char[][] letterH() {
		char[][] h = {
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#','#','#','#','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
		};
		return h;
	}

	static char[][] letterI() {
		char[][] i = {
				{' ','#','#','#',' ',' '},
				{' ',' ','#',' ',' ',' '},
				{' ',' ','#',' ',' ',' '},
				{' ',' ','#',' ',' ',' '},
				{' ',' ','#',' ',' ',' '},
				{' ','#','#','#',' ',' '},
		};
		return i;
	}

	static char[][] letterJ() {
		char[][] j = {
				{'#','#','#','#','#',' '},
				{' ',' ',' ',' ','#',' '},
				{' ',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#','#','#','#',' ',' '},
		};
		return j;
	}

	static char[][] letterK() {
		char[][] k = {
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ','#',' ',' '},
				{'#','#','#',' ',' ',' '},
				{'#',' ','#',' ',' ',' '},
				{'#',' ',' ','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
		};
		return k;
	}
	
	static char[][] letterL() {
		char[][] l = {
				{'#',' ',' ',' ',' ',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#',' ',' ',' ','#',' '},
				{'#','#','#','#','#',' '},
		};
		return l;
	}

	static char[][] letterM() {
		char[][] m = {
				{'#',' ',' ',' ','#',' '},
				{'#','#',' ','#','#',' '},
				{'#',' ','#',' ','#',' '},
				{'#',' ','#',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
		};
		return m;
	}

	static char[][] letterN() {
		char[][] n = {
				{'#',' ',' ',' ','#',' '},
				{'#','#',' ',' ','#',' '},
				{'#',' ','#',' ','#',' '},
				{'#',' ','#',' ','#',' '},
				{'#',' ',' ','#','#',' '},
				{'#',' ',' ',' ','#',' '},
		};
		return n;
	}

	static char[][] letterO() {
		char[][] o = {
				{' ','#','#','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{' ','#','#','#',' ',' '},
		};
		return o;
	}

	static char[][] letterOE() {
		char[][] oe = {
				{' ','#',' ','#',' ',' '},
				{' ','#','#','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{' ','#','#','#',' ',' '},
		};
		return oe;
	}

	static char[][] letterP() {
		char[][] p = {
				{'#','#','#','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
				{'#','#','#','#',' ',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#',' ',' ',' ',' ',' '},
				{'#',' ',' ',' ',' ',' '},
		};
		return p;
	}

	static char[][] letterQ() {
		char[][] q = {
				{' ','#','#',' ',' ',' '},
				{'#',' ',' ','#',' ',' '},
				{'#',' ',' ','#',' ',' '},
				{'#',' ',' ','#',' ',' '},
				{'#',' ',' ','#',' ',' '},
				{' ','#','#',' ','#',' '},
		};
		return q;
	}

	static char[][] letterR() {
		char[][] r = {
				{'#','#','#','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
				{'#','#','#','#',' ',' '},
				{'#',' ','#',' ',' ',' '},
				{'#',' ',' ','#',' ',' '},
				{'#',' ',' ',' ','#',' '},
		};
		return r;
	}

	static char[][] letterS() {
		char[][] s= {
				{' ','#','#','#',' ',' '},
				{'#',' ',' ',' ',' ',' '},
				{' ','#','#','#',' ',' '},
				{' ',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{' ','#','#','#',' ',' '},
		};
		return s;
	}

	static char[][] letterT() {
		char[][] t = {
				{'#','#','#','#','#',' '},
				{' ',' ','#',' ',' ',' '},
				{' ',' ','#',' ',' ',' '},
				{' ',' ','#',' ',' ',' '},
				{' ',' ','#',' ',' ',' '},
				{' ',' ','#',' ',' ',' '},
		};
		return t;
	}

	static char[][] letterU() {
		char[][] u = {
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{' ','#','#','#',' ',' '},
		};
		return u;
	}

	static char[][] letterV() {
		char[][] v = {
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{' ','#',' ','#',' ',' '},
				{' ','#',' ','#',' ',' '},
				{' ',' ','#',' ',' ',' '},
		};
		return v;
	}

	static char[][] letterW() {
		char[][] w = {
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{'#',' ','#',' ','#',' '},
				{'#',' ','#',' ','#',' '},
				{' ','#',' ','#',' ',' '},
		};
		return w;
	}

	static char[][] letterX() {
		char[][] x = {
				{'#',' ',' ',' ',' ','#'},
				{' ','#',' ',' ','#',' '},
				{' ',' ','#','#',' ',' '},
				{' ',' ','#','#',' ',' '},
				{' ','#',' ',' ','#',' '},
				{'#',' ',' ',' ',' ','#'},
		};
		return x;
	}

	static char[][] letterY() {
		char[][] y = {
				{'#',' ',' ',' ','#',' '},
				{'#',' ',' ',' ','#',' '},
				{' ','#',' ','#',' ',' '},
				{' ',' ','#',' ',' ',' '},
				{' ',' ','#',' ',' ',' '},
				{' ',' ','#',' ',' ',' '},
		};
		return y;
	}
	
	static char[][] letterZ() {
		char[][] z = {
				{'#','#','#','#','#',' '},
				{'#',' ',' ',' ','#',' '},
				{' ',' ',' ','#',' ',' '},
				{' ',' ','#',' ',' ',' '},
				{' ','#',' ',' ','#',' '},
				{'#','#','#','#','#',' '},
		};
		return z;
	}
	
	static char[][] whiteSpace() {
		char[][] ws = {
				{' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' '},
		};
		return ws;
	}

}
