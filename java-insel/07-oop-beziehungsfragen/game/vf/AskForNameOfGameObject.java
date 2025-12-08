package com.JavaInsel.Chapter7.game.vf;

public class AskForNameOfGameObject {

	public static void main(String[] args) {

		Player player = new Player();
		player.name = "Godman";
		printQuestion(player);
		
		GameObject room = new Room();
		room.name = "Hogwurz";
		printQuestion(room);
	}

	public static void printQuestion(GameObject inputGameOpject) {
		System.out.println("Woher kommmt " + inputGameOpject.name + "?");
	}

}
