package com.saki.captainciao.chapter05;

import java.util.Arrays;

public class DecolumnizerMain {

    public static void main(String[] args) {
        Decolumnizer decolumnizer = new Decolumnizer();

        String textWithColumns = "I’m dishonest, and a to watch out for,\n" +
                "dishonest man you because you can\n" +
                "can always trust to never predict when\n" +
                "be dishonest. they’re going to do\n" +
                "Honestly, it’s the something incredibly\n" +
                "honest ones you want stupid.";


        System.out.println(Arrays.toString(decolumnizer.separateEachLineArray(textWithColumns)));
        for (String str : decolumnizer.separateEachLineArray(textWithColumns)) {
            System.out.println(str);
        }
        decolumnizer.determinLongestStringLine(textWithColumns);

    }
}
