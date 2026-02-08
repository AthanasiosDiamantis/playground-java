package com.saki.java.chapter06.game.v4;

public class Wizard {

    String name = "";
    int age;

    Wizard name(String name) {
        this.name = name;
        return this;
    }
    String name() {
        return name;
    }

    Wizard age(int age) {
        this.age = age;
        return this;
    }
    int age() {
        return age;
    }

    String format() {
        return name + " ist " + age;
    }
}
