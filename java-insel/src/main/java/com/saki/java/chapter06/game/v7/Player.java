package com.saki.java.chapter06.game.v7;

public class Player {

    public String name;
    public String item;

    public Player() {
    //default constructor
    }

    public Player(Player player) {
        this.name = player.name;
        this.item = player.item;
    }
    public Player(Object player) {
        // this constructor is not taken from jvm, if the copy-constructor is used jvm is using always the nearest constructor
        // in this case it is Player(Player player)
    }


}
