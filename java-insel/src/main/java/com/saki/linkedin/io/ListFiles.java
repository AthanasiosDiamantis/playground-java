package com.saki.linkedin.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListFiles {

    public static void main(String[] args) throws IOException {
        String directoryPath = "src";

        Files.walk(Paths.get(directoryPath)).filter(Files::isRegularFile).forEach(System.out::println);

        System.out.println("\n Now listing only directory Paths \n");
                                         
        Files.walk(Paths.get(directoryPath)).filter(Files::isDirectory).forEach(System.out::println);

    }
}
