package com.saki.java.chapter06.game.v3;

public class Player {

    String name = "";
    String item = "";

    public void carry(String newItem){
        if(newItem != null && !newItem.trim().isEmpty()) {
            item += newItem;
        }
    }

    public boolean doesCarryAnything() {
        return !item.isEmpty();
    }
    /**
     * @author athanasios diamantis
     * @since 1.0
     * this method deletes all items and sets the String to empty "" string.
     */
    public void dropAll() {
        item = "";
    }

}
