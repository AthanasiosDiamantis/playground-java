package com.saki.linkedin.advancedjava.functional;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Integer> randomNumbersSupplier = () -> new Random().nextInt(100);

        List<Integer> generatedRandomList = Stream.generate(randomNumbersSupplier)
                .limit(10)
                .sorted()
                .toList();
        System.out.println(generatedRandomList);

    }

}
