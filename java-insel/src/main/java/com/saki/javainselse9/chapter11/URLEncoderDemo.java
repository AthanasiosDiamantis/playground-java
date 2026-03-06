package com.saki.javainselse9.chapter11;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncoderDemo {

    public static void main(String[] args) {
        try{
            PrintStream o = System.out;
            String utf8 = StandardCharsets.UTF_8.name();

            o.println( URLEncoder.encode( "L e e r z eichen", utf8 ) ); // L+e+e+r+z+eichen
            o.println( URLEncoder.encode( "20%Prozent%", utf8 ) ); // 20%25Prozent%25
            o.println( URLEncoder.encode( "hat+ein+Plus", utf8 ) ); // hat%2Bein%2BPlus
            o.println( URLEncoder.encode( "/temp/data/", utf8 ) ); // %2Ftemp%2Fdata%2F
            o.println( URLEncoder.encode( "Sagt \"Gänse\"", utf8 ) ); // Sagt+%22G%C3%A4nse%22
            o.println( URLEncoder.encode( ":Doppelpunkt:", utf8 ) ); // %3ADoppelpunkt%3A
            o.println( URLEncoder.encode( "a=b=c", utf8 ) ); // a%3Db%3Dc
            o.println( URLEncoder.encode( "Und&Co", utf8 ) ); // Und%26Co
            o.println( URLEncoder.encode( "..Punkte..", utf8 ) ); // ..Punkte..


        } catch(UnsupportedEncodingException uee){
            uee.printStackTrace();
        }

    }
}
