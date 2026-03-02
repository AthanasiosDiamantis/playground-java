package com.saki.javainsel17.chapter20;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteArrayOutputStreamExample {

    public static void main(String[] args) {
        byte[] bytes = { 'O','N','A','L','D' };

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            out.write('D');
            out.write(bytes);
            out.write(bytes, 1,2);
            System.out.println( out.toString(StandardCharsets.ISO_8859_1) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
