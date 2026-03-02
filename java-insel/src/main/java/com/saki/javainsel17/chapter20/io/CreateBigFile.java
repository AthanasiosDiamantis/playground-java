package com.saki.javainsel17.chapter20.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CreateBigFile {

    public static void main(String[] args) throws FileNotFoundException {

        try (RandomAccessFile file = new RandomAccessFile(System.getProperty("user.home") + "/test.bin", "rw") ){
            file.seek(999);
            file.write(0xFF);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
