package com.JavaInsel.Chapter7.game.vf;

/**
 * main class where everything goes on
 */
public class Playground {

	public static void main(String[] args) {

		Room rr = new Room();
		rr.name = "Affenhausen";
		rr.size = 7349944;
		System.out.println(rr.toString());

		GameObject rg = new Room();
		rg.name = "Affenhausen";
		System.out.println(rg.toString());
		
		Object ro = new Room();
		System.out.println(ro.toString());

//		Room clinic = new Room();
//		clinic.name = "Clinic";
//		clinic.size = 120_000;
//
//		Player theDoc = new Player();
//		theDoc.name = "Dr. Schuwibscho";

		// GameObject go = new GameObject();
		// stopped here
	}

}
