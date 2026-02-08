package com.saki.java.chapter06.game.v5;

public class Playground {

    public static void main(String[] args) {
        Player spongebobby = new Player();

        spongebobby.setName("Spongebobby");
        System.out.println(spongebobby.getName());
        spongebobby.setItem("Schnecke");
        System.out.println(spongebobby.getItem());
    }
}
