package com.JavaInsel.Chapter7.oop;

public class ToStringFromSuper {

	
	public ToStringFromSuper() {
		System.out.println( super.toString());
	}
	
	public static void main(String[] args) {
		new ToStringFromSuper();
		System.out.println("sdfsdf");
		
	}
	
	@Override
	public String toString() {
		return "Nein";
	}
	
}
