package com.saki.linkedin.advancedjava.functional;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceExample {

    @FunctionalInterface
    public interface StringTransform {

        String apply(String input);
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "streams");
        StringTransform appendFoo = input -> input + "Foo";

        List<String> stringsFoo = strings.stream()
                .map(appendFoo::apply)
                .toList();

        System.out.println("Original Strings-List: " +strings);
        System.out.println("transformed Strings-list: " +stringsFoo);

    }


}
