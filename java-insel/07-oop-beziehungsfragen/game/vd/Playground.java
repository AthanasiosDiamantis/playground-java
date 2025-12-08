package com.JavaInsel.Chapter7.game.vd;

/**
 * main class where everything goes on
 */
public class Playground {
	
	public static void main(String[] args) {
		Room clinic = new Room();
		clinic.name = "Clinic";
		clinic.size = 120_000;
		
		Player theDoc = new Player();
		theDoc.name = "Dr. Schuwibscho";
		
		GameObject go = new GameObject();
		// stopped here
	}

}
