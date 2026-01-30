package com.saki.java.chapter04;

/**
 * demonstrates the input arguments from command line interface "terminal". The arguments are passed through
 * arg-Array argument in the main static method into the java project
 *
 * to start this class from terminal follow this steps:
 * 1. change in root-directory of this class (just look up to package!)
 * 2. go there e.g. with cd ../.. etc.
 * 3. in the folder java check with ls if you see the 'com' directory
 * 4. execute this order: javac com/saki/java/chapter04/LovesGoldHamster.java
 * 5. at the end execute this order: (base) saki@MacBookProM1-2 java % java com.saki.java.chapter04.LovesGoldHamster Marie Otto Heribert Alpha Delta Eco
 */
public class LovesGoldHamster {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Whaaat nobody loves hamsters!!!");
        }
        else {
            System.out.println("Oh yes, you love hamsters!!!");
        }

        if(args.length > 0) {
            for (String argString : args) {
                System.out.printf("%nargString contains this text :' %s '",argString);
            }
        }

    }
}
