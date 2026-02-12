package com.saki.java.chapter07.game.vb;

public class Playground {
    public static void main(String[] args) {
        Player buster = new Player();
        Room tower = new Room();
        buster.room = tower;
        tower.player = buster;
        Room toilet = new Room();
        toilet.player = buster;

        System.out.println(buster);
        System.out.println(tower);
        System.out.println(toilet);
        System.out.println(buster.room);
        System.out.println(tower.player);
        System.out.println(toilet.player);

    }

}
