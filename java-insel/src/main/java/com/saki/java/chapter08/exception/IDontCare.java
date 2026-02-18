package com.saki.java.chapter08.exception;

import java.nio.file.Paths;
import java.util.Scanner;

public class IDontCare {

    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        Scanner in = new Scanner(Paths.get("lyrics.txt"));
        System.out.println(in.nextLine());
    }
}
