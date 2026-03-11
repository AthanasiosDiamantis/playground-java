package com.saki.javase9.chapter11.chatgptproposal;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class BasicAuth {

    public static void main(String[] args) throws IOException {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                System.out.printf("url=%s, host=%s, ip=%s, port=%s%n",
                        getRequestingURL(), getRequestingHost(),
                        getRequestingSite(), getRequestingPort());

                return new PasswordAuthentication("httpwatch", "abc".toCharArray());
            }
        });

        String url = "https://www.httpwatch.com/httpgallery/authentication/authenticatedimage/default.aspx";

        try (Scanner scanner = new Scanner(new URL(url).openStream(), StandardCharsets.UTF_8)) {
            System.out.println(scanner.useDelimiter("\\Z").next());
        }
    }
}
