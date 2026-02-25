package com.saki.java.chapter12.generic;

public class RocketPlayer {


    public static void main(String[] args) {

        Rocket<Integer> intRocket = new Rocket<>();
        Rocket<String> stringRocket = new Rocket<>();

        intRocket.set(1);
        int x = intRocket.get(); // keine Typumwandlung
        stringRocket.set("Sesquipedalian");
        String s = stringRocket.get();

        Rocket<Rocket<String>> rocketOfRockets = new Rocket<>();
        rocketOfRockets.set(new Rocket<>());
        rocketOfRockets.get().set("Innerer Rocket<String>");
        System.out.println(rocketOfRockets.get().get());

    }
}
