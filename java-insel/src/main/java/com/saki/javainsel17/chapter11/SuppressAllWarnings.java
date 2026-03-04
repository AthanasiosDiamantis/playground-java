package com.saki.javainsel17.chapter11;


import java.util.ArrayList;
import java.util.List;

//@SuppressWarnings("all") // instead of suppressing all warnings it is possible to work more selective
@SuppressWarnings({"rawtypes","unchecked"})
public class SuppressAllWarnings {

    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("SuppressedWarnings");

        ArrayList list2 = new ArrayList();
        System.out.println(list1);
        System.out.println(list2);

    }
}
