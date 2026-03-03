package com.saki.linkedin.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {
        String filePath = "output.txt";
        String message = "Hello World!, This is a message written to a file";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(message);
            System.out.println("Message was written to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file, message is: " + e.getMessage());
        }
    }
}
