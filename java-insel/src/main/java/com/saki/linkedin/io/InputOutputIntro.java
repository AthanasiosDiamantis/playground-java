package com.saki.linkedin.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputIntro {

    public static void main(String[] args) {
        String filePath = "example.txt";
        String message = "Hello Java I/O !";

        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(message);
            System.out.println("Message written to: " + message);
        } catch (IOException e) {
            System.err.println( "Error writing to File: " + e.getMessage()) ;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String readMessage = reader.readLine(); // assuming message is a single line!
            System.out.println("Message read from: " + readMessage);
        } catch (IOException e) {
            System.err.println( "Error reading File: " + e.getMessage()) ;
        }

    }
}
