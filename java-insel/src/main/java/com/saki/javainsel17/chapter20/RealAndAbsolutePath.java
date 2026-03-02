package com.saki.javainsel17.chapter20;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RealAndAbsolutePath {

    public static void main(String[] args) {
        Path dotDotSlashDotDot = Paths.get("../..");
        System.out.println(dotDotSlashDotDot.toAbsolutePath());

        try {
            System.out.println(dotDotSlashDotDot.toRealPath( LinkOption.NOFOLLOW_LINKS));

            System.out.println(Paths.get("../♡").toRealPath(LinkOption.NOFOLLOW_LINKS));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
