package com.saki.captainciao.chapter05;

public class Decolumnizer {

    /**
     *
     */
    private int arrayPositionLongestRow;

    private int maximumTextLength;


    public void deculumnize(String string) {

    }

    /**
     *
     * @param completeLineStringOfPage the complete text of one page to be analysed
     * @return the array-position of the longest line in the text to be determined
     */
    public int determinLongestStringLine(String completeLineStringOfPage) {
        String[] linesArray = separateEachLineArray(completeLineStringOfPage);
        int linesCount = linesArray.length;
        int longestLinePossitionTag = 0;
        int maximumLineLength = 0;
        for (int i = 0; i < linesCount; i++) {
            if (linesArray[i].length() > maximumLineLength) {
                maximumLineLength = linesArray[i].length();
                longestLinePossitionTag = i;
            }
        }
        maximumTextLength = maximumLineLength;

        // TODO at the end these test lines should be erased, but they help identify the longest row

        System.out.println("the longest line is: " + maximumLineLength);
        System.out.println("the longest line is at i: " + longestLinePossitionTag);
        System.out.println("the text is: " + linesArray[longestLinePossitionTag]);

        return longestLinePossitionTag;
    }

    /**
     * @param inputText the input to come in
     * @return returns a string-array with each line in a separate array-field
     */
    public String[] separateEachLineArray(String inputText) {
        return inputText.split("\n");
    }

}
