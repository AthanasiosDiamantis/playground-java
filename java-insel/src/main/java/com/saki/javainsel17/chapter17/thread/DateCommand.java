package com.saki.javainsel17.chapter17.thread;

import java.time.LocalDateTime;
import java.util.stream.Stream;

public class DateCommand implements Runnable{
    @Override
    public void run() {
        Stream.generate(LocalDateTime::now).limit(20).forEach(System.out::println);
    }
}
