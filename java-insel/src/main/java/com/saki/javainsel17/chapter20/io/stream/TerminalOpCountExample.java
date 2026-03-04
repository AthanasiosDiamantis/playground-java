package com.saki.javainsel17.chapter20.io.stream;

import java.util.Objects;
import java.util.stream.Stream;

public class TerminalOpCountExample {

    public static void main(String[] args) {
        Object[] array = {null, 1, null, 2,3,null,7,2,1,null};
        long size = Stream.of(array)
                .filter(Objects::nonNull)
                .count();
        System.out.println(size); //6
    }
}
