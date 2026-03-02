package com.saki.javainsel17.chapter20;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystemPathFileDemo2 {

    public static void main(String[] args) {
        Path p = Paths.get("../..");
        System.out.println(p.toString());
        System.out.println(p.isAbsolute());
        System.out.println(p.getRoot());
        System.out.println(p.getParent());
        System.out.println(p.getNameCount());
        System.out.println(p.getName(p.getNameCount()-1));
    }
}
