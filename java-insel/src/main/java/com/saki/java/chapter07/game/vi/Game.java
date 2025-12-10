package com.saki.java.chapter07.game.vi;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {

	public static void main(String[] args) {

		// Assoziativspeicher verbindet Namen mit Spielobjekten
		HashMap<String, GameObject> gameObjects = new HashMap<>();
		gameObjects.put("höllentor", new Door(1));
		gameObjects.put("höllenschlüssel", new Key(1));
		gameObjects.put("himmelschlüssel", new Key(9));

		// Spezielle Syntax, um eine Unterklasse von GameObject zu schreiben
		// und dann die Methode zu überschreiben
		GameObject nullGameObject = new GameObject() {

			@Override
			public boolean useOn(GameObject object) {
				return false;
			}
		};

		while (true) {
			System.out.printf("Was möchtest Du tun?%n> ");
			String input = new Scanner(System.in).nextLine().toLowerCase();
			if (input.matches("ende|bye|schluss|quit|finito|basta")) {
				System.exit(0);
			}
			String simlifiedLine = input.replaceAll("benutze|stecke|nutze|mit|bei|unter|in", "");
			StringTokenizer tokenizer = new StringTokenizer(simlifiedLine);
			if (tokenizer.countTokens() < 2) {
				System.out.println("Details bitte, '" + input + "' richt mir nicht!");
			continue;
			}
			GameObject subject = gameObjects.getOrDefault(tokenizer.nextToken(), nullGameObject);
			GameObject oject = gameObjects.getOrDefault(tokenizer.nextToken(), nullGameObject );
			System.out.println( subject.useOn(oject) ? "Ausgeführt" : "Konnte '" + input + "' nicht ausführen");
		}

	}

}
