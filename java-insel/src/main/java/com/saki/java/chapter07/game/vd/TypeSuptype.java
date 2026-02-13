package com.saki.java.chapter07.game.vd;

public class TypeSuptype {

    public static void main(String[] args) {
        Player plyerIsPlayer = new Player();
        GameObject gameObjectIsPlayer = new Player();
        Object objectIsPlayer = new Player();
        Room roomisRoom = new Room();
        GameObject gameObjectIsRoom = new Room();
        Object objectIsRoom = new Room();

        GameObject goIsRoom = new Room();

        System.out.println(goIsRoom.name);

        Room cubbyhole = (Room) goIsRoom; //
        System.out.println(cubbyhole.name +" & "+ cubbyhole.size);

    }
}
