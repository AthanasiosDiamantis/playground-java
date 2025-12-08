package com.JavaInsel.Chapter7.game.vk;

public class Playground {

	public static void main(String[] args) {

		Magazine madMag = new Magazine();
		madMag.price = 2.50;
		Buyable schoki = new Chocolate();
		Magazine maxim = new Magazine();
		maxim.price = 3.00;
		
		System.out.printf("All products together cost: %.2f Maga-€", PriceUtils.calculateSum(maxim, schoki, madMag ));

	}

}
