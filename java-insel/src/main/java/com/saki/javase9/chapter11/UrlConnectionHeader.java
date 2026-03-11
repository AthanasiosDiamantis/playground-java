package com.saki.javase9.chapter11;

import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Instant;

public class UrlConnectionHeader {

    public static void main(String[] args) {


        try {
            URL url = new URL("http://www.tutego.de/index.htlm");
            URLConnection con = url.openConnection();

            PrintStream out = System.out;

            out.println(con);
            out.println("Date               : " + Instant.ofEpochMilli(con.getDate()));
            out.println("Last Modified:     : " + Instant.ofEpochMilli(con.getLastModified()));
            out.println("Content-Encoding   : " + con.getContentEncoding());
            out.println("Content-Type:      : " + con.getContentType());
            out.println("Content-Length:    : " + con.getContentLength());

        } catch (MalformedURLException e) {
            System.err.println("something went wrong with the 'text-format' of the url: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An I/O error occurred while trying to connect to the url: " + e.getMessage());
        }

    }
}
