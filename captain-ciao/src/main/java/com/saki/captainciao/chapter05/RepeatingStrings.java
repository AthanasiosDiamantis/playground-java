package com.saki.captainciao.chapter05;

public class RepeatingStrings {

    public static void main(String[] args) {
        System.out.println(repeatingStrings("Ciao" + "Ciao"));
        System.out.println(repeatingStrings("aaaaaa"));
        System.out.println(repeatingStrings("Captain CiaoCiaoCaptain CiaoCiao"));
        System.out.println(repeatingStrings("🌼🌻"+"🌼🌻"+"🌼🌻"));
        System.out.println(repeatingStrings("🌼"));
        System.out.println(repeatingStrings(""));
        System.out.println(repeatingStrings(null));



    }


    public static String repeatingStrings(String incommingString) {

        if (incommingString == null || incommingString.isEmpty() || incommingString.length() == 1) {
            return null;
        }
        // check lenght of the string
        int lengthOfString = incommingString.length();
        int counter = 0;
        // check if one sign is equal
        for (int letterPosition = 1; letterPosition <= lengthOfString / 2; letterPosition++) {
            counter++;
            String checkingStringFirstPart = incommingString.substring(0, letterPosition);
            String checkingStringLastPart = incommingString.substring(letterPosition, letterPosition + counter);
            if (checkingStringFirstPart.equals(checkingStringLastPart)) {
                return checkingStringFirstPart;
            }

        }

        return null;
    }
}
