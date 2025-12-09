package com.saki.captainciao.chapter05;

public class WordWrap {


    public static void main(String[] args) {
        String sentence = "Live now; make now always the most precious time. Now will never come again.";
        String cropedString = wrap(sentence, 30);
        System.out.println(cropedString);

    }

    public static String wrap(String string, int width) {

        if (string.length()< width) {
            return string;
        }

        String originStringToBeShortened = string;

        String breakeLinedString = "";
        int lastStringPos = 0;
        while (originStringToBeShortened.length() > lastStringPos) {
            String shortenedString = getMax30CharString(originStringToBeShortened, width);
            lastStringPos = lastStringPos + shortenedString.length();
            originStringToBeShortened = string.substring(lastStringPos);
            breakeLinedString = breakeLinedString + shortenedString + "\n";
        }
        breakeLinedString = breakeLinedString + originStringToBeShortened;


        return breakeLinedString;
    }

    private static String getMax30CharString(String string, int width) {

        int lastWhiteSpacePos = 0;

        for (int i = 0; i < width; i++) {
            if (string.charAt(i) == ' ') {
                lastWhiteSpacePos = i + 1;
            }
        }
        return string.substring(0, lastWhiteSpacePos);
    }
}
