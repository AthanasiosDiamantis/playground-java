package com.saki.captainciao.chapter05;

public class RepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(isEveryCharcterTwice("eehhrrwwüürrddiiggeerr$$ccaappttaaiinn"));
		
		
	}
	
	public static int isEveryCharcterTwice(String inputString) {
		int result = 1;
		
		// check if a char is double
		
		for (int i = 0; i < inputString.length()-1; i++) {
			
			if(i%2 == 0 && inputString.charAt(i) == inputString.charAt(i+1)) {
				// TODO think about the solution!!! this solution is not correct for the moment
			} else {
				result = -i;
				return result;
			}
		}
		
		
		
		
		return result;
		
	}
}
