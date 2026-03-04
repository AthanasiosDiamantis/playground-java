package com.saki.javainsel17.chapter20.io.stream;

import java.util.stream.Stream;

public class StreamOfExample {

    public static void main(String[] args) {
        Stream.of(-4,1,-2,-5,22,-3,-12,14)
                .map(Math::abs)
                .sorted()
                .forEach(System.out::println);
    }
}
