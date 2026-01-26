package com.saki.java.chapter03;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * an example for imprort declaration
 */
public class DatePrinter {

    public static void printCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter tf = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.printf("your current system time is: %s %nand the date is: %s ", ZonedDateTime.now().format(tf), LocalDate.now().format(dtf));
    }

}
