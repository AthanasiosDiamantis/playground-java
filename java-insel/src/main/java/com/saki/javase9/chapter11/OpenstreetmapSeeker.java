package com.saki.javase9.chapter11;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class OpenstreetmapSeeker {

    public static void main(String[] args) throws IOException {
        String search = args.length > 0 ? String.join("_", args) : "berlin";
        search = URLEncoder.encode(search, StandardCharsets.UTF_8.name());

        String urlString = "https://nominatim.openstreetmap.org/search?q=" + search + "&format=jsonv2&linit=10";

//        String baseUrl = "https://nominatim.openstreetmap.org/search.php?q=";
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "OpenstreetmapSeeker/1.0 (learning project; contact: bei Berlin, Germany");
        connection.setRequestProperty("Accept", "application/json");

        int status = connection.getResponseCode();

        if(status != 200) {
            throw new IOException("HTTP error code : " + status);
        }

        try (InputStream in = connection.getInputStream();
             Scanner scanner = new Scanner(in, StandardCharsets.UTF_8);) {
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } finally {
            connection.disconnect();
        }
        // this was part of the former code from JavaSE9 / ullenboom
//        Pattern pattern = Pattern.compile("<span class=\"name\">(.+?)</span>");
//        try (Scanner scanner = new Scanner (url.openStream(), StandardCharsets.UTF_8.name() ) ) {
//            scanner.findAll(pattern)
//                    .map(matchResult -> matchResult.group(1))
//                    .forEach(System.out::println);
//        }
    }
}
