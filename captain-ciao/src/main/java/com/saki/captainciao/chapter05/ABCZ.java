package com.saki.captainciao.chapter05;

import java.util.logging.Logger;

public class ABCZ {

    static Logger log = Logger.getLogger(ABCZ.class.getName());
    public static void main(String[] args) {

        log.info(abcz());

        log.info(abcz('a','g'));
        log.info(abcz('a', 5));
    }

    public static String abcz() {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c = 'A'; c <= 'Z'; c++) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static String abcz(char start, char end) {
        if (end < start) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(end - start + 1);
        for (char c = start; c <= end; c++) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static String abcz(char start, int length) {
        if (length <=0) {
            return "";
        }
        return abcz(start, (char) (start + length -1));

    }
}
