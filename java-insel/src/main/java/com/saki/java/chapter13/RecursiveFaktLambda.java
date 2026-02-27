package com.saki.java.chapter13;

import java.util.function.IntFunction;

public class RecursiveFaktLambda {

    public static IntFunction<Integer> fact =
            n -> (n==0) ? 1 : n * RecursiveFaktLambda.fact.apply(n-1);

    public static void main(String[] args) {
        System.out.println(fact.apply(5)); //120
    }

}
