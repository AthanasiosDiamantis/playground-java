package com.saki.javase9.chapter11.chatgptproposal.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class SimplePostServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/post", SimplePostServer::handlePost);
        server.setExecutor(null);
        server.start();

        System.out.println("Server running at http://localhost:8080/post");
    }

    private static void handlePost(HttpExchange exchange) throws IOException {
        System.out.println("Method: " + exchange.getRequestMethod());

        if (!"POST".equalsIgnoreCase(exchange.getRequestMethod())) {
            String response = "Only POST is supported";
            exchange.sendResponseHeaders(405, response.getBytes(StandardCharsets.UTF_8).length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes(StandardCharsets.UTF_8));
            }
            return;
        }

        InputStream inputStream = exchange.getRequestBody();
        String body = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

        System.out.println("received body: " + body);

        String response = "POST received: " + body;
        byte[] responseBytes = response.getBytes(StandardCharsets.UTF_8);

        exchange.getResponseHeaders().add("Content-Type", "text/plain; charset=UTF-8");
        exchange.sendResponseHeaders(200, responseBytes.length);


        try ( OutputStream os = exchange.getResponseBody()) {
            os.write(responseBytes);
        }
    }
}
