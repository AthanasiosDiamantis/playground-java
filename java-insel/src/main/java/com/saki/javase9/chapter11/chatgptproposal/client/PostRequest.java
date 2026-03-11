package com.saki.javase9.chapter11.chatgptproposal.client;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PostRequest {
    public static void main(String[] args) throws IOException {
        String body =
                "param1=" + URLEncoder.encode("value1", StandardCharsets.UTF_8) +
                "&param2=" + URLEncoder.encode("value2", StandardCharsets.UTF_8);

        URL url = new URL("http://localhost:8080/post");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setUseCaches(false);

        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Length",
                String.valueOf(body.getBytes(StandardCharsets.UTF_8).length));

        try (OutputStream os = connection.getOutputStream()) {
            os.write(body.getBytes(StandardCharsets.UTF_8));
        }

        int status = connection.getResponseCode();
        System.out.println("HTTP Status : " + status);

        try(InputStream is = connection.getInputStream();
            Scanner scanner = new Scanner(is, StandardCharsets.UTF_8);) {
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }

        connection.disconnect();
    }
}
