package com.saki.javainsel17.chapter20.io.stream;

public class StreamForEachOrderedExample {

    public static void main(String[] args) {
        "Afrin".chars().parallel().forEach(c -> System.out.print( (char) c));
        System.out.println();
        "Afrin".chars().parallel().forEachOrdered(c -> System.out.print( (char) c));
    }
}
