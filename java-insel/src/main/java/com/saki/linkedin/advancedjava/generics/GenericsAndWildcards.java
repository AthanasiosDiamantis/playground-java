package com.saki.linkedin.advancedjava.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsAndWildcards {

    static class Box<T> {

        private T content;

        public Box(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }

        public void setContent(T content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "content=" + content +
                    '}';
        }

    }

    // can use every object type as ?
    public static void printBoxes(List<Box<?>> boxes) {

        for (Box<?> box : boxes) {
            System.out.println(box);
        }
    }

    // upperbound wildcard ? extends Number, means inherits from Number all Object-Types
    public static void printNumberBoxes(List<Box<? extends Number>> boxes) {

        for (Box<? extends Number> box : boxes) {
            System.out.println(box);
        }
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(1);
        List<Box<?>> mixedBoxes = Arrays.asList(stringBox, integerBox);
        printBoxes(mixedBoxes);

        Box<Integer> anotherIntegerBox = new Box<>(4711);
        Box<Double> doubleBox = new Box<>(3.234);
        List<Box<? extends Number>> numberBoxes = Arrays.asList(anotherIntegerBox, doubleBox);

        printNumberBoxes(numberBoxes);
//        printNumberBoxes(mixedBoxes); // Required type: List<Box<? extends Number>>    Provided: List<Box<?>>
    }

}
