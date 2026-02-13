package com.saki.java.chapter07.game.vd;

public class ClassCastExeptionDemo {

    public static void main(String[] args) {
        GameObject go = new Player(); // Compiler sees a GameObject-Object: reference variable, but JVM creates Player-Object
        Room cubbyhole = (Room) go; // expect class cast exception
        System.out.println(cubbyhole.name +" & "+ cubbyhole.size);

//        Player player = (Player) go;
//        System.out.println("name of player object: " +player.name);
    }
}
