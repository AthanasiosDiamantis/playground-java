package com.saki.javainsel17.chapter20;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystemPathFileDemo1 {

    public static void main(String[] args) {
        Path p = Paths.get("/Users/saki/Entwicklung/playground-java/java-insel/");
        System.out.println(p.getFileSystem());// sun.nio.fs.MacOSXFileSystem@6acbcfc0
        System.out.println(p.isAbsolute());// false
        System.out.println(p.getRoot());// null
        System.out.println(p.getParent());// Users/saki/Entwicklung/playground-java
        System.out.println(p.getNameCount());//        5
        System.out.println(p.getName(p.getNameCount()-3));//        Entwicklung
        System.out.println(p.getName(p.getNameCount()-1));//        java-insel

        Path p2 = Paths.get("Users/saki/Entwicklung/playground-java/java-insel/");
        System.out.println(p2.isAbsolute()); // false, because the first slash is missing
    }
}
