package com.saki.java.chapter06.oop;

public class PasswordDemo {

    public static void main(String[] args) {
        Password pwd = new Password();
        System.out.println();

        pwd.assing("", "TeutoburgerWald");
        System.out.println("changed PWD to TeutoburgerWald and Check if set: "+ pwd.check("TeutoburgerWald"));

        pwd.assing("TeutoburgerWald", "Doppelkeks");
        System.out.println("after change to Doppelkeks check if TeutoburgerWald is still set as PWD: " + pwd.check("TeutoburgerWald"));
        System.out.println("check if Doppelkeks is set as new PWD: "+ pwd.check("Doppelkeks"));

        pwd.assing("Doppelkeks", "panic");

        System.out.println("is panic the right PWD?: " + pwd.check("panic"));

    }

}
