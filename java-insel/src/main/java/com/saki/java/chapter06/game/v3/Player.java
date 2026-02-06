package com.saki.java.chapter06.game.v3;

public class Player {

    String name = "";
    String item = "";

    public void carry(String newItem) {
        if (newItem != null && !newItem.trim().isEmpty()) {
            item += newItem.trim() + ";";
        }
    }

    public boolean doesCarryAnything() {
        return !item.isEmpty();
    }

    public void dropAll() {
        item = "";

    }

}
