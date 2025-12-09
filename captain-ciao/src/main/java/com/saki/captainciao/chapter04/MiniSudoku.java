package com.saki.captainciao.chapter04;

public class MiniSudoku {

	public static void main(String[] args) {
		// create a mini sudoku with a 2 dimensional array of a 3 x 3 matrix, 
		// check if all 1-9 numbers are placed
		
		int[][] sudoku1 = new int[3][3];
		sudoku1[0][0] = 1;
		sudoku1[0][1] = 2;
		sudoku1[0][2] = 3;
		sudoku1[1][0] = 4;
		sudoku1[1][1] = 5;
		sudoku1[1][2] = 6;
		sudoku1[2][0] = 7;
		sudoku1[2][1] = 8;
		sudoku1[2][2] = 9;
		
		for (int outer = 0; outer < 3; outer++) {
			for (int inner = 0; inner < 3; inner++) {
				System.out.print(sudoku1[outer][inner]+"  ");
			}
			System.out.println();
		}
	}
	
	static int checkWhichNumberIsMissing(int[][] checkSudoku) {
		int missingNumber= -1;
		int[] arrayAllNumbers = {1,2,3,4,5,6,7,8,9,};
		int[] checkedNumbers = new int[8];
		int countNumber = 1;
		
		for (int i = 0; i < 9;i++) {
			for (int outer = 0; outer < 3; outer++) {
				for (int inner = 0; inner < 3; inner++) {
					if(countNumber == checkSudoku[outer][inner]) {
						
						// TODO put some thinking here, I don't know how it's going on...
					}
				}
			}
		}
		return missingNumber;
	}

}
