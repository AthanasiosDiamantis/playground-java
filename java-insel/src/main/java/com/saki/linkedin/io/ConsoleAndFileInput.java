package com.saki.linkedin.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleAndFileInput {

    // before using this, you must execute the java-programm "InputOutputIntro" in order to produce a file with content
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file to read: ");
        String fileName = scanner.nextLine();

        System.out.println("Reading from file: " + fileName);
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);

        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
        scanner.close();

    }
}
