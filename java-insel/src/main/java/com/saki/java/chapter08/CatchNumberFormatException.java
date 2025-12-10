package com.saki.java.chapter08;

public class CatchNumberFormatException {

	public static void main(String[] args) {
		String stringToConvert = "19%";
		double vat = 19;
		
		try {
			vat = Integer.parseInt(stringToConvert);
		}
		catch (NumberFormatException e) {
			System.err.printf(" '%s' kann man nich in eine Zahl konvertieren %n", stringToConvert);
		}
		
		System.out.printf("Weiter geht's mit MwSt=%g%n", vat);
		// TODO Auto-generated method stub

	}

}
