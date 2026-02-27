package com.saki.java.chapter13;

import java.util.function.Predicate;

public class InnnerVsLambdaDefaultMethod {

    class TruePredicate implements Predicate<Object> {
        @Override
        public boolean test(Object o) {
            return negate().test(o);
        }
    }
}
