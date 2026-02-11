package com.saki.java.chapter06.oop;

import java.util.Scanner;

public class LateConstant {

    public final static int HUBBLE;
    public final String ISBN;

    static {
        try(Scanner scanner = new Scanner(LateConstant.class.getResourceAsStream("/hubble-constant.txt"))) {
            HUBBLE = scanner.nextInt();
        }
    }

    public LateConstant() {
        ISBN = "7342634352";
    }

    public static void main(String[] args) {
        System.out.println(HUBBLE);
        System.out.println(new LateConstant().ISBN);
    }
}
