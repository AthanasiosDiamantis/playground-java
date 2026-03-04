package com.saki.javainsel17.chapter20.io.stream;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamUnaryOperatorShuffleOpExampel {

    public static void main(String[] args) {

        UnaryOperator<String> shuffleOp = s -> {
            char[] chars = s.toCharArray();
            for(int index = chars.length-1; index >= 0; index--){
                int rndIndex = ThreadLocalRandom.current().nextInt( index + 1);
                if(index == rndIndex) continue;
                char c = chars[rndIndex];
                chars[rndIndex] = chars[index];
                chars[index] = c;
            }
            return new String(chars);
        };
        String text = "He's a very naughty boy! Now, go away!";
        Stream.iterate(text,shuffleOp).limit(10).forEach(System.out::println);
    }
}
