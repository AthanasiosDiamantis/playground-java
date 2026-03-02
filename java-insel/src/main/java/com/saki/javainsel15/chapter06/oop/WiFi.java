package com.saki.javainsel15.chapter06.oop;

public class WiFi {

    String password = "+covfefe";
    boolean isAuthenticated;

    boolean authenticate(String password) {
        return isAuthenticated = this.password.equals(password);
    }

    boolean isAuthenticated() {
        return isAuthenticated;
    }

}
