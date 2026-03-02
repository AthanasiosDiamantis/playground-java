package com.saki.javainsel17.chapter20;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListAllLines {

    public static void main(String[] args) throws URISyntaxException, IOException {
        URI uri = ListAllLines.class.getResource("/lyrics.txt").toURI();
        Path p = Paths.get(uri);

        System.out.printf("File '%s' with size of %d byte(s) with lines:%n",p.getFileName(), Files.size(p));

        int lineCnt = 1;
        for( String line : Files.readAllLines(p) ) {
            System.out.println(lineCnt++ +": " + line);
        }

    }
}
