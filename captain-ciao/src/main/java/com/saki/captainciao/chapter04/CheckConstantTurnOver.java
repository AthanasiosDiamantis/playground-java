package com.saki.captainciao.chapter04;

public class CheckConstantTurnOver {


	public static void main(String[] args) {
		
		final int LENGTH_OF_MONTH = 31;

		
		int[] dayOfMonthArray = new int[LENGTH_OF_MONTH];
		int[] dailyGains = new int[LENGTH_OF_MONTH];
		
		// Input randomized turn over
		for (int i = 0; i < LENGTH_OF_MONTH; i++) {
			dayOfMonthArray[i]= i;
			dailyGains[i] = (int) (Math.random()*10_000);			
		}
		
		// Output line with days of month
		for (int i = 0; i < LENGTH_OF_MONTH; i++) {
			if (i==0) {
				System.out.print("Day:   \t\t");
			}
			System.out.printf("%6d,",dayOfMonthArray[i]);
		}
		// break line
		System.out.println();
		
		// Output line with turn over of each day
		for (int i = 0; i < LENGTH_OF_MONTH; i++) {
			if (i==0) {
				System.out.print("Daily turn over:");
			}
			System.out.printf("%6d,",dailyGains[i]);
		}
		System.out.println();
		System.out.printf("you have: %d Points this month",count5PercentJumps(dailyGains));
		

	}
	static int count5PercentJumps(int[] inputTurnOver) {
		final int MIN_PERCENTAGE = 5;
		int counter5Percent = 0;
		int percent = 0;
		System.out.print("Percentage:\t\t");
		for (int i = 0; i<inputTurnOver.length-1; i++) {
			percent = (int)(((double)inputTurnOver[i+1]/inputTurnOver[i])*100-100);
			System.out.printf("%6d,",percent);
			if(percent >= MIN_PERCENTAGE) {
				counter5Percent++;
			}
		}
		System.out.println();
		return counter5Percent;
		
	}

}
