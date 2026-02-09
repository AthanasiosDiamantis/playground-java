package com.saki.java.chapter06.game.v6;

public class Playground {
    public static void main(String[] args) {
        Player playerOne = new Player("Disruptus One");
        Player playerTwo = new Player("Optimus Two", "happy Mushroomshield");
        System.out.println(playerOne.name + " and " + playerOne.item);
        System.out.println(playerTwo.name + " and " + playerTwo.item);
    }
}
