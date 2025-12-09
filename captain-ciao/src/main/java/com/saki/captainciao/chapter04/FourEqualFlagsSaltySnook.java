package com.saki.captainciao.chapter04;

import java.util.Objects;

public class FourEqualFlagsSaltySnook {

	public static void main(String[] args) {
	
		
		String[] signs1 = {"F", "DO", "MOS", "MOS", "MOS", "MOS", "WES"};
		String[] signs2 = {"F", "DO", "MOS", "MOS", "WES", "MOS", "MOS"};
		String[] signs3 = {"F", "DO", "MOS", "MOS", "WES", "MOS", "MOS", 
							"MOS", "LES", "LES", "LES", "LES", "TR"};
		
		System.out.println(isProbablyAproaching( signs1 ) ) ;
		System.out.println(isProbablyAproaching( signs2 ) ) ;
		System.out.println(isProbablyAproaching( signs3 ) ) ;
	}
	
	public static boolean isProbablyAproaching(String[] input) {
		final int FORMER_OCCURRANCES = 4;
		int fourTimesSameCounter = 1;
		
		// das ist eine For-Schleife
		for (int i = 0; i < input.length-1; i++) {
			String currentSign = Objects.requireNonNull(input[i]);
			String nextSign = Objects.requireNonNull(input[i+1]) ;
			
			if ( currentSign.equalsIgnoreCase(nextSign) ) {
				fourTimesSameCounter++;
			}
			else {
				fourTimesSameCounter = 1;
			}
			if (fourTimesSameCounter >= FORMER_OCCURRANCES) {
				return true;
			}

		}
		return false;
	}
}