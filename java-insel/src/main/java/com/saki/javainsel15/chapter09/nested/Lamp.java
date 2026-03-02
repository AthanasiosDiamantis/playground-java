package com.saki.javainsel15.chapter09.nested;

public class Lamp {

    static String name = "Latifa";
    int watt = 1985;

    static class Bulb {

        public void output() {
            System.out.println(name);
//            System.out.println(watt); // Non-static field 'watt' cannot be referenced from a static context
        }
    }

    public static void main(String[] args) {
        Bulb bulb = new Lamp.Bulb();
        bulb.output();
    }


}
