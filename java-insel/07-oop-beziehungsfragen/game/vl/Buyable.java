package com.JavaInsel.Chapter7.game.vl;

interface Buyable {
	int MAX_PRICE = 10_000_000;
	
	static boolean isValidPrice(double price) {
		return price >=0 && price < MAX_PRICE;
	}
  double price();
}