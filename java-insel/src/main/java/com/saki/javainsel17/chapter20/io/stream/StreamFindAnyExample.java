package com.saki.javainsel17.chapter20.io.stream;

import java.util.List;
import java.util.function.Consumer;

public class StreamFindAnyExample {

    public static void main(String[] args) {
        Consumer<Character> print = System.out::println;
        List<Character> chars = List.of('1','a','2','3','c','b');
        chars.parallelStream().findFirst().ifPresent(print);
        chars.parallelStream().findAny().ifPresent(print);
    }
}
