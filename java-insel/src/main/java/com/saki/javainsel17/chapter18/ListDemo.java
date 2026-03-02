package com.saki.javainsel17.chapter18;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Eva");
        list1.add(0,"Chrisma");
        list1.add(1,"Pallas");

        List<String> list2 = Arrays.asList("Tina", "Wilhelmine");
        list1.addAll(3,list2);
        list1.add("XXX");
        list1.set(5,"Eva");

        System.out.println(list1);
        System.out.println(list1.size());

        boolean b = list1.contains("Tina");
        System.out.println(b);

        b = list1.containsAll( Arrays.asList("Tina","Eva"));
        System.out.println(b);

        Object o = list1.get(1);
        System.out.println(o);

        int i = list1.indexOf("Eva"); //2
        System.out.println(i);

        i = list1.lastIndexOf("Eva");//5
        System.out.println(i);

        System.out.println(list1.isEmpty());

        String[] array = list1.toArray(new String[list1.size()]);

        System.out.println(array[3]);

        List<String> list3 = new LinkedList<>(list1);
        System.out.println(list3);

        list3.retainAll(Arrays.asList("Tina", "Eva"));
        System.out.println(list3);

        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);

        list1.remove("Wilhelmine");
        System.out.println(list1);

        list1.clear();
        System.out.println(list1);

        List<String> list4 = new ArrayList<>();
        Collections.addAll(list4, "1","","","zwei", null,"Polizei");
        list4.removeIf(e-> Objects.isNull(e) || e.trim().isEmpty());
        System.out.println(list4);

    }
}
