package com.saki.linkedin.advancedjava.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionAndBiFunction {

    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;


        int result = square.apply(5);
        System.out.println(result);

        BiFunction<Integer, Integer, String> addAndToString = (x,y) ->Integer.toString(x+y);

        String sumAndString = addAndToString.apply(5, 3);
        System.out.println(sumAndString);
    }
}
