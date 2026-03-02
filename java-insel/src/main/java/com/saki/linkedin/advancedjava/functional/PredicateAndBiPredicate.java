package com.saki.linkedin.advancedjava.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateAndBiPredicate {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-5, 3, -1, 4, -2, 7, 0, -12, 11, 8, -9, 22,23,24,25,26);

        Predicate<Integer> isPositive = number -> number >= 0;
        List<Integer> positiveNumbersList = numbers.stream()
                .filter(isPositive)
                .sorted()
                .toList();
        System.out.println(positiveNumbersList);

        Predicate<Integer> isNegative = number -> number < 0;
        List<Integer> negativeList = numbers.stream()
                .filter(isNegative)
                .sorted()
                .toList();
        System.out.println(negativeList);

        BiPredicate<Integer, Integer> isSumEven = (sum1, sum2) -> (sum1 + sum2) % 2 == 0;
        System.out.printf(" is sum even?: %s%n", isSumEven.test(4, 5));
        System.out.printf(" is sum even?: %s%n", isSumEven.test(4, 4));

        Predicate<Integer> isGraterThan3 = n -> n > 3;
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGraterThan3AndIsEvenFunction = isGraterThan3.and(isEven);

        List<Integer> isPositiveAndEvenAndGrater3List = numbers.stream()
                .filter(isGraterThan3AndIsEvenFunction)
                .sorted()
                .toList();
        System.out.println(isPositiveAndEvenAndGrater3List);
    }
}
