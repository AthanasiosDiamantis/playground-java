package com.saki.javase9.chapter04;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyFirstCollection {

    private static void fill(Collection<String> c) {
        c.add("Giuli");
        c.add("Zorro");
        c.add("Klaus");
        c.add("Albert");
    }

    public static void main(String[] args) {
        List<String> c = new LinkedList<>();
        fill(c);
        System.out.println(c);
        Collections.sort(c);
        System.out.println(c);

    }
}
