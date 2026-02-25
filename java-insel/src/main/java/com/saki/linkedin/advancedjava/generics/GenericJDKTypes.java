package com.saki.linkedin.advancedjava.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenericJDKTypes {

    public static void main(String[] args) {
        List<String> bookTitles = new ArrayList<>();
        bookTitles.add("Effective Java");
        bookTitles.add("Java Concurrency in Practice");
        bookTitles.add("Clean Code");


        List<String> filteredTitles = bookTitles.stream()
                .filter(title -> title.startsWith("Effective"))
                .toList();

        System.out.println(filteredTitles);

        Optional<String> mybeFoundTitle = bookTitles.stream()
                .filter(title -> title.contains("Java"))
                .findFirst();

        mybeFoundTitle.ifPresent(title -> System.out.println("Found title: " + title));


    }
}
