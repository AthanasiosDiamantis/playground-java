package com.saki.java.chapter06.oop;

import javax.swing.*;

public class Password {

    private String password = "";

    public void assing(String oldPassword, String newPassword) {

        if (check(oldPassword)) {
            this.password = newPassword;
        } else {
            System.out.println("Passwords don't match");
        }

    }

    public boolean check(String passwordToCheck) {
        return password.equals(passwordToCheck);
    }


}
