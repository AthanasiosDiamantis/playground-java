package com.saki.linkedin.oop.collections;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveWrappers {

    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        // Autoboxing means that the primitive type is entered and JVM puts it into the Integer-Class
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        System.out.println(numbers.get(0));
        // mhh no mehtods on 1.get().... What happened here?
        // primitive type int was Wrapped with Integer Class
        System.out.println(numbers.get(0).getClass());

        // Unboxing is that an Integer value is been converted back to the primitive type int
        int x = numbers.get(1);
        System.out.println(x);
        System.out.println(numbers.contains(3));

    }
}
