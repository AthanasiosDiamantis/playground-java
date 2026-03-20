package com.saki.captainciao.chapter15;

import java.util.ArrayList;
import java.util.Collection;

public class QuizStringBuilder {

    public static void main(String[] args) {
        Collection<String> islands1= new ArrayList<>();
        islands1.add("Galapagos");
        islands1.add("Revillagigedo");
        islands1.add("Clipperton");
        System.out.println(islands1.contains("Clipperton"));

        Collection<StringBuilder> islands2= new ArrayList<>();
        islands2.add(new StringBuilder("Galapagos"));
        islands2.add(new StringBuilder("Revillagigedo"));
        islands2.add(new StringBuilder("Clipperton"));
        System.out.println(islands2.contains(new StringBuilder("Clipperton")));

    }
}
