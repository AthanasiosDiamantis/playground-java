package com.saki.linkedin.advancedjava.functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperator {

    public static void main(String[] args) {
        UnaryOperator<Integer> negate = x -> -x;
        System.out.println(negate.apply(5));

        BinaryOperator<Integer> max = (x,y) -> x > y ? x : y;
        System.out.println(max.apply(4,23));

        BiFunction<Integer, Integer, Integer> maxAndNegateFunction = max.andThen(negate);
        maxAndNegateFunction.apply(5,3);
        System.out.println(maxAndNegateFunction.apply(5,3));
    }

}
