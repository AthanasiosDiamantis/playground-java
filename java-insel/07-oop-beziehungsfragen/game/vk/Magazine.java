package com.JavaInsel.Chapter7.game.vk;

public class Magazine extends GameObject implements Buyable{
	
	double price;

	@Override
	public double price() {
		return price;
	}

}
