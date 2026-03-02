package com.saki.linkedin.advancedjava.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerAndBiConsumer {

    public static void main(String[] args) {
        Consumer<String> messagePrinter = message -> System.out.println("Message : " + message);
        messagePrinter.accept("Hello this is a dangerous kangaroo");

        BiConsumer<String, String> combiningMessagePrinter = (str1, str2) -> System.out.println(str1 + " " + str2);
        combiningMessagePrinter.accept("Saki", "hallo World");

    }
}
