package com.saki.java.chapter08.exception;

public class SuppressedClosed {
    public static void main(String[] args) throws Exception {
        try (NotCloseable res1 = new NotCloseable();
             NotCloseable res2 = new NotCloseable()) {
            throw new NullPointerException();
        }
    }
}
