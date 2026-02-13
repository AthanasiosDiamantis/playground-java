package com.saki.java.chapter07.game.ve;

public class PlayGround {

	public static void main(String[] args) {
		GameObject go = new GameObject();
		go.name= "Fantastic GameObject";
		System.out.println(go.toString());
		
		Room room = new Room();
		room.name = "Kammer des Schreckens";
		room.size = 666;
		System.out.println(room.toString());
		System.out.println(room); // println always call the toString-Methode of its an object
	}
}
