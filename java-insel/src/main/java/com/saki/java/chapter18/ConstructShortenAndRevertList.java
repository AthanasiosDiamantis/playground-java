package com.saki.java.chapter18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ConstructShortenAndRevertList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>( Arrays.asList("0 1 2 3 4 5 6 7 8 9".split(" ")));
        System.out.println(list.size());
        System.out.println(list);
        list.subList(2,list.size()-2).clear();
        System.out.println(list);
        for (ListIterator<String> it = list.listIterator(list.size() );
             it.hasPrevious(); )
            System.out.println(it.previous() + " ");

    }
}
