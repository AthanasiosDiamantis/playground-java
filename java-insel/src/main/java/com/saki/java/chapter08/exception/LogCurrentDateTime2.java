package com.saki.java.chapter08.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class LogCurrentDateTime2 {

    public static void logExecutedProgram() throws IOException {
        String content = System.getProperty("sun.java.command") + " started at " + LocalDateTime.now() + "\n";

        try {
            Files.writeString(Path.of("executed_programs.txt"), content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            logExecutedProgram();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
