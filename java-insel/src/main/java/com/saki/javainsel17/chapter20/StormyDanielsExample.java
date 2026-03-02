package com.saki.javainsel17.chapter20;

import java.nio.file.Path;
import java.nio.file.Paths;

public class StormyDanielsExample {

    public static void main(String[] args) {

        Path picturePath = Paths.get(System.getProperty("user.home"))
                .resolve("Pictures_XXXX")
                .resolve("Squid_Game");
        System.out.println(picturePath);

        System.out.println(picturePath.toAbsolutePath());
    }
}
