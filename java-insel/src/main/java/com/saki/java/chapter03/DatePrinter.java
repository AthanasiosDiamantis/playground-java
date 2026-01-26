package com.saki.java.chapter03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * an example for imprort declaration
 */
public class DatePrinter {

    public static void printCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("your current system time is : " + LocalDate.now().format(dtf));
    }

}
