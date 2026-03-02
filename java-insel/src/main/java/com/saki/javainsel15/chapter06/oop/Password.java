package com.saki.javainsel15.chapter06.oop;

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
