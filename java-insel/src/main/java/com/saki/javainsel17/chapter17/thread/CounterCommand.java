package com.saki.javainsel17.chapter17.thread;

import java.util.stream.IntStream;

public class CounterCommand implements Runnable {
    @Override
    public void run() {
        IntStream.range(0,200).forEachOrdered(System.out::println);
    }
}
