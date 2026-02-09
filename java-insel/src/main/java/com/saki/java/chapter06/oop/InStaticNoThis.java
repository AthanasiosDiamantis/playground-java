package com.saki.java.chapter06.oop;

public class InStaticNoThis {

    String name;

    void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        // name = "Mama"; // Non-static field 'name' cannot be referenced from a static context
        // printName(); // Non-static method 'printName()' cannot be referenced from a static context
        // System.out.println(this); // 'com.saki.java.chapter06.oop.InStaticNoThis.this' cannot be referenced from a static context
    }
}
