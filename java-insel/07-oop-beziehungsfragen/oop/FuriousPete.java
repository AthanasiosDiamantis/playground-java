package com.JavaInsel.Chapter7.oop;

class PizzaEater {
	int consumptionTime = 900 /* Sekonds */;

	void eat() {
		System.out.printf("Ich esse in %d Sekunden eine Pizza%n", consumptionTime);
	}
}

public class FuriousPete extends PizzaEater {

	int consumptionTime = 32 /* Seconds */;

	@Override
	void eat() {
		System.out.println(consumptionTime);
		System.out.println(super.consumptionTime);
		System.out.println(this.consumptionTime);
		System.out.println( ((PizzaEater) this).consumptionTime );
	}
	
	public static void main(String[] args) {
		new FuriousPete().eat();
	}

}
