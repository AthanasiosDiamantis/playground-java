package com.saki.captainciao.chapter04;

public class SweetShopMug {

	public static void main(String[] args) {

		int[] values = { 10, 20, 30, 40, 40, 50, 40, 70, 80, 10, 30, 20, 30, 40, 30, 29, 23, 42, 64, 75 };
		int[] values1 = {1};
		int[] values2 = {2,33,4,5,6,7,82,9,23,4,5,3,34,5,64,5,64,7,9,44,3,56,8,6,67,94,23,54,34,52,17,38,85};
		System.out.println("The correct position is position no. : " + findSplitPoint(values));
		System.out.println("the correct postion of the second array is: " + findSplitPoint(values1));
		System.out.println("the correct postion of the third array is: " + findSplitPoint(values2));

	}

	private static int findSplitPoint(int[] input) {
		if(input.length<2) {
			return -1;
		}
		int countLeft = 1;
		int countRight = input.length-1;
		int sumLeftSide = input[0];
		int sumRightSide = input[countRight];

		
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%4d<-->%4d und Position von : %d %n",sumLeftSide, sumRightSide, countLeft);

			// check who is smaller and add array field
			if (sumLeftSide <= sumRightSide) {
				sumLeftSide += input[countLeft];
				countLeft++;
			}
			else {
				sumRightSide += input[countRight-1];
				countRight--;
			}
			
			if (countRight<=countLeft) {
				break;
			}
			
		}
			
		if ( relativeDifference(sumLeftSide, sumRightSide) > 10 ) {
			return -1;
		}
		else {
			return countLeft;
		}
		
//		int countLeft = 1;
//		int countRight = input.length-2;
//		int sumLeftSide = input[0];
//		int sumRightSide = input[input.length-1];
//		
//		for (int i = 1; i < countRight; i++) {
//			
//			// if left has less then fill array from left
//			if (sumLeftSide < sumRightSide) {
//				// sum of left side
//				sumLeftSide = sumLeftSide + input[countLeft];
//				countLeft++;
//				System.out.println(sumLeftSide);
//			}
//			else {
//				// sum of right side
//				sumRightSide = sumRightSide + input[countRight];
//				countRight--;
//				System.out.println(sumRightSide);
//			}			
//			// break for if countLeft == countRight and output result of count
//			if (countRight <= countLeft) {
//				break;
//			}
//		}
//		// if difference is bigger 10 % then return -1
//		if (relativeDifference(sumLeftSide, sumRightSide) < 10) {
//			return -1;
//		}
//		else {
//			return countLeft+1;	
//		}

	}

	private static int relativeDifference(int a, int b) {
		int absoluteDifference = Math.abs(a - b);
		return (int) (100. * absoluteDifference / Math.max(a, b));
	}
}
