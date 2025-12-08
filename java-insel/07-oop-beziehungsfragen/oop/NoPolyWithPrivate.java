package com.JavaInsel.Chapter7.oop;

public class NoPolyWithPrivate {

	public static void main(String[] args) {
		Banana unsicht = new Banana();
		System.out.println(unsicht.bar());
		System.out.println(unsicht.frucht());
	}
}

/**
 * a new Fruit class
 */
class Fruit {

	private int frucht() { //
		return 2;
	}

	int bar() {
		return frucht(); // ((Banana)(this)).
	}
}

/**
 * a new Banana class extends Fruit
 */
class Banana extends Fruit {

	// does not override
	public int frucht() {
		return 1;
	}
}
