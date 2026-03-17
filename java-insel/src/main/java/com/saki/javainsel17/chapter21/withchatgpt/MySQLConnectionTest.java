package com.saki.javainsel17.chapter21.withchatgpt;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javademo?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "javauser";
        String password = "javapass123";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
