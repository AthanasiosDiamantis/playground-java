package com.saki.java.chapter07.oop;

public class ToStringFromSuper {

	
	public ToStringFromSuper() {
		System.out.println( super.toString());
	}
	
	public static void main(String[] args) {
		new ToStringFromSuper();
		ToStringFromSuper test = new ToStringFromSuper();

		System.out.println(test.toString());
		
	}
	
	@Override
	public String toString() {
		return "Nein";
	}
	
}
