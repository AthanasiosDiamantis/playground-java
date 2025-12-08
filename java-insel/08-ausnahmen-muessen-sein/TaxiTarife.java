package com.JavaInsel.Chapter8.Exceptions;

public class TaxiTarife {

	public static void main(String[] args) {
		int km = 10;
		
		System.out.println("Tarif 1 kostet: " + tarif1(km));
		System.out.println("Tarif 2 kostet: " + tarif2(km));

	}
	
	static double tarif1 ( int km) {
		double result = 1.9 * km + 4.2;
		return result;
	}
	
	static double tarif2 ( int km) {
		double result = 2.1 * km + 2.2;
		return result;
	}

}
