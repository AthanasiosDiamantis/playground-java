package com.saki.linkedin.advancedjava.generics;

public class GenericMethods {

    // to make this method generic introduce the generic parameter T in diamond brackets
    public static <T> boolean contains(T[] array, T value) {
        for (T element : array) {
            if(element.equals(value))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1, 2, 3};
        String[] stringArray = new String[]{"Java", "Python", "Ruby"};

        System.out.println(contains(intArray, 3)); // true
        System.out.println(contains(stringArray, "Java")); // true
        System.out.println(contains(stringArray, "C++")); // false
    }
}
