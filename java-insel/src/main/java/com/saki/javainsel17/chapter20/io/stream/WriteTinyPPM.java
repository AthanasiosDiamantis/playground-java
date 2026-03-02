package com.saki.javainsel17.chapter20.io.stream;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteTinyPPM {

    public static void main(String[] args) {
        Path file= Path.of(System.getProperty("user.home"), "littelepic.tmp.ppm");
        try(OutputStream out = Files.newOutputStream( file)) {
            out.write("P3 10 10 255 255 0 0".getBytes(StandardCharsets.ISO_8859_1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("wrote: " + file);

    }
}
