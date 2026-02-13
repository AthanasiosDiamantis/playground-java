package com.saki.java.chapter07.game.vi;

public class Playground {
	
	public static void main(String[] args) {
		Door door1 = new Door(1);
		door1.name = "Door Nr. One";
		GameObject key1 = new Key(1);
		key1.name = "Key Nr. One";
		GameObject key9 = new Key(9);
		key9.name = "Key Nr. Nine";

		System.out.println("is door one open? "+door1.isOpen);
		System.out.printf("If you use %s to open %s will this succeed? %b and will the door open? %b%n", key9.name, door1.name, key9.useOn(door1), door1.isOpen);
		System.out.printf("If you use %s to open %s will this succeed? %b and will the door open? %b%n", key1.name, door1.name, key1.useOn(door1), door1.isOpen);
		System.out.printf("is it possible to use a door in a key??? = %b%n", door1.useOn(key1));
		System.out.println("is door one open? "+door1.isOpen);
		
	}
}
