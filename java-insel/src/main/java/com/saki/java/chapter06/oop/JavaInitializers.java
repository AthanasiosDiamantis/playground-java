package com.saki.java.chapter06.oop;

import java.sql.SQLOutput;

public class JavaInitializers {

    static {
        System.out.println("static block, only once when jvm creates class");
    }

    {
        System.out.println("object initializer (Exemplarinitialisierer) comes everytime when new is called");
    }

    public JavaInitializers() {
        System.out.println("Constructor, comes at the end");
    }

    public static void main(String[] args) {
        new JavaInitializers();
        new JavaInitializers();
    }
}
