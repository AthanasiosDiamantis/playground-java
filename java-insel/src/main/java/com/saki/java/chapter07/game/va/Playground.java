package com.saki.java.chapter07.game.va;

public class Playground {

    public static void main(String[] args) {
        Player buster = new Player();
        Room tower = new Room();
        buster.room = tower; // Buster comes into the tower-room
    }
}
