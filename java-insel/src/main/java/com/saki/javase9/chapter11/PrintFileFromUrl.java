package com.saki.javase9.chapter11;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintFileFromUrl {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.tutego.de/javabuch/aufgaben/bond.txt");

            try (InputStream is = url.openStream() ;
            Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.name()) ){
                System.out.println(scanner.useDelimiter("\\Z").next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
